package com.study.introduction.record.mapper;

import com.study.introduction.common.Criteria;
import com.study.introduction.common.Pagination;
import com.study.introduction.record.dto.RecordDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface RecordMapper {

    /** 게시글 입력 */
    int insertRecord(RecordDTO recordDTO) throws Exception;

    /** 게시글 파일 등록 */
    void insertImg(@Param("files") String[] files) throws Exception;

    /** 게시글 목록 조회 */
    List<RecordDTO> selectRecordList(Criteria criteria) throws Exception;

    /** 게시글 카테고리별 목록 조회 */
    List<RecordDTO> selectRecordCateList(@Param("pagination") Pagination pagination,
                                     @Param("recordType")String recordType) throws Exception;

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
