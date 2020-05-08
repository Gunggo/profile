package com.study.introduction.member.service;

import com.study.introduction.member.bean.MemberBean;

import java.util.List;

public interface MemberService {

    /* 회원목록 조회 */
    public List<MemberBean> selectMemberList() throws Exception;

}
