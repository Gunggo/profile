package com.study.introduction.member.service;

import com.study.introduction.member.dto.MemberDTO;

import java.util.List;

public interface MemberService {

    /* 회원목록 조회 */
    List<MemberDTO> selectMemberList() throws Exception;

    /* 로그인 */
    MemberDTO login(MemberDTO memberBean) throws Exception;

}
