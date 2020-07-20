package com.study.introduction.record.dto;

import com.study.introduction.common.CommonDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RecordDTO extends CommonDTO {

    /* 게시글 PK */
    private int recordNo;
    /* 게시글 타입 */
    private String recordType;
    /* 게시글 썸네일 경로 */
    private String recordThumb;
    /* 게시글 제목 */
    private String recordTitle;
    /* 게시글 내용 */
    private String recordContent;

}
