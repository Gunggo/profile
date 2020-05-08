package com.study.introduction.member.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class MemberBean {

    /* 회원 No */
    private int mbNo;
    /* 회원 이메일 */
    private String mbEmail;
    /* 회원 비밀번호 */
    private String mbPw;
    /* 회원 닉네임 */
    private String mbNm;
    /* 회원가입 일 */
    private Date regDt;
    /* 회원정보 수정일 */
    private Date updDt;

}
