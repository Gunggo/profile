package com.study.introduction.member.service;

import com.study.introduction.member.bean.MemberBean;
import com.study.introduction.member.dao.MemberDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberDao memberDao;

    /* 회원목록 조회 */
    public List<MemberBean> selectMemberList() throws Exception {

        List<MemberBean> memberList = new ArrayList<>();
        memberList = memberDao.selectMemberList();

        return memberList;
    }

}
