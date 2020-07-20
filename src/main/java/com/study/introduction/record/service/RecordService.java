package com.study.introduction.record.service;

import com.google.gson.JsonObject;
import com.study.introduction.common.Criteria;
import com.study.introduction.common.Pagination;
import com.study.introduction.record.dto.RecordDTO;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface RecordService {

    /** 게시글 입력 */
    int insertRecord(RecordDTO recordDTO) throws Exception;

    /** SummerNote 이미지 업로드 */
    JsonObject recordImg(MultipartFile multipartFile) throws Exception;

    /** 게시글 조회 */
    List<RecordDTO> selectRecordList(Criteria criteria) throws Exception;

//    /** 게시글 조회 */
//    List<RecordDTO> selectRecordList(Pagination pagination) throws Exception;

    /** 게시글 카테고리별 조회 */
    List<RecordDTO> selectRecordCateList(Pagination pagination, String recordType) throws Exception;

    /** 게시글 조회 */
    RecordDTO selectRecord(int recordNo) throws Exception;

    /** 게시글 카운트 */
    int getRecordListTotCnt() throws Exception;

    /** 게시글 카테고리별 카운트 */
    int getRecordListCateCnt(String recordType) throws Exception;

    /** 게시글 수정 */
    int updateRecord(RecordDTO recordDTO) throws Exception;

    /** 게시글 삭제 */
    int deleteRecord(int recordNo) throws Exception;

}
