package com.study.introduction.code.dto;

import com.study.introduction.common.CommonDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CodeDTO extends CommonDTO {

    /* 코드 PK */
    private int codeNo;
    /* 코드 */
    private String code;
    /* 코드 이름 */
    private String codeName;
    /* 코드 그룹이름 */
    private String codeGrpName;
}
