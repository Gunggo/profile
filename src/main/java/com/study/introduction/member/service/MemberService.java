package com.study.introduction.member.service;

import com.study.introduction.member.bean.MemberBean;

import java.util.List;

public interface MemberService {

    /* 회원목록 조회 */
    List<MemberBean> selectMemberList() throws Exception;

    /* 로그인 */
    MemberBean login(MemberBean memberBean) throws Exception;

}
