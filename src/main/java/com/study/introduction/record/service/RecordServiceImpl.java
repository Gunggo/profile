package com.study.introduction.record.service;

import com.google.gson.JsonObject;
import com.study.introduction.common.Criteria;
import com.study.introduction.common.Pagination;
import com.study.introduction.common.UploadFileUtils;
import com.study.introduction.record.dto.RecordDTO;
import com.study.introduction.record.mapper.RecordMapper;
import lombok.RequiredArgsConstructor;
import org.apache.commons.io.FileUtils;
import org.joda.time.DateTime;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.transaction.Transactional;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class RecordServiceImpl implements RecordService {

    private final RecordMapper recordMapper;
    private static final Logger logger = LoggerFactory.getLogger(RecordServiceImpl.class);

    /** 게시글 입력 */
    @Transactional
    public int insertRecord(RecordDTO recordDTO) throws Exception{

        int resultNo = recordMapper.insertRecord(recordDTO);

        try {
            Document doc = Jsoup.parse(recordDTO.getRecordContent());
            Elements imgs = doc.getElementsByTag("img");
            String[] files = new String[imgs.size()];

            // 파일경로 추출 및 파일정보 DB 삽입
            if (imgs.size() != 0) {
                for(int i =0; i < imgs.size(); i++) {
                    files[i] = imgs.get(i).attr("src");
                }

                recordMapper.insertImg(files);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return resultNo;
    }

    /** SummerNote 이미지 업로드 */
    public JsonObject recordImg(MultipartFile multipartFile) throws Exception {

        JsonObject jsonObject = new JsonObject();

        DateTime dt = new DateTime();
        String saveDate = dt.toString("yyyy-MM-dd");

        String fileRoot =  "C:\\summernote_image\\" + saveDate + "\\"; // 폴더 경로
        File saveFolder = new File(fileRoot);

        // 날짜별 디렉토리 생성
        if (!saveFolder.exists()) {
            try {
                // mkdir return value = boolean
                saveFolder.mkdir();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String originalFileName = multipartFile.getOriginalFilename(); // 원래 파일명
        String extension = originalFileName.substring(originalFileName.lastIndexOf(".")); // 파일 확장자
        String savedFileName = UUID.randomUUID() + extension; // 저장될 파일 명

        File targetFile = new File(fileRoot + savedFileName);

        try {
            InputStream fileStream = multipartFile.getInputStream();
            FileUtils.copyInputStreamToFile(fileStream, targetFile); // 파일 저장
//            UploadFileUtils.makeThumbnail(fileRoot, savedFileName); // 썸네일 생성
            jsonObject.addProperty("url", "/summernoteImage/" + saveDate + "/" + savedFileName);
//            jsonObject.addProperty("thumbUrl", "/summernoteImage/" + saveDate + "/s_" + savedFileName);
            jsonObject.addProperty("responseCode", "success");
        } catch (IOException e) {
            FileUtils.deleteQuietly(targetFile); // 저장된 파일 삭제
            jsonObject.addProperty("responseCode", "error");
            e.printStackTrace();
        }

        return jsonObject;
    }

    /** 게시글 조회 */
    public List<RecordDTO> selectRecordList(Criteria criteria) throws Exception {

        List<RecordDTO> recordList = new ArrayList<>();

        // 미리보기용 HTML 태그 제거
        for(RecordDTO recordDTO : recordMapper.selectRecordList(criteria)) {
            String str = recordDTO.getRecordContent().replaceAll("<[^>]*>"," ");

            recordDTO.setRecordContent(str);
            recordList.add(recordDTO);
        }

        return recordList;
    }

    /** 게시글 카테고리별 조회 */
    public List<RecordDTO> selectRecordCateList(Pagination pagination, String recordType) throws Exception {

        List<RecordDTO> recordList = new ArrayList<>();

        // 미리보기용 HTML 태그 제거
        for(RecordDTO recordDTO : recordMapper.selectRecordCateList(pagination,recordType)) {
            String str = recordDTO.getRecordContent().replaceAll("<[^>]*>"," ");

            recordDTO.setRecordContent(str);
            recordList.add(recordDTO);
        }

        return recordList;
    }

    /** 게시글 조회 */
    public RecordDTO selectRecord(int recordNo) throws Exception {
        return recordMapper.selectRecord(recordNo);
    }

    /** 게시글 카운트 */
    public int getRecordListTotCnt() throws Exception {
        return recordMapper.getRecordListTotCnt();
    }

    /** 게시글 카테고리별 카운트 */
    public int getRecordListCateCnt(String recordType) throws Exception {
        return recordMapper.getRecordListCateCnt(recordType);
    }

    /** 게시글 수정 */
    public int updateRecord(RecordDTO recordDTO) throws Exception {
        return recordMapper.updateRecord(recordDTO);
    }

    /** 게시글 삭제 */
    public int deleteRecord(int recordNo) throws Exception {
        return recordMapper.deleteRecord(recordNo);
    }

}
