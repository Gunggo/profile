package com.study.introduction.member.dto;

import com.study.introduction.common.CommonDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MemberDTO extends CommonDTO {

    /* 회원 No */
    private int mbNo;
    /* 회원 이메일 */
    private String mbEmail;
    /* 회원 비밀번호 */
    private String mbPw;
    /* 회원 닉네임 */
    private String mbNm;

}
