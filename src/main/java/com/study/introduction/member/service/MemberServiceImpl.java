package com.study.introduction.member.service;

import com.study.introduction.member.dto.MemberDTO;
import com.study.introduction.member.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class MemberServiceImpl implements MemberService {

    private static final String ROLE_PREFIX = "ROLE_";

    private final MemberMapper memberMapper;

    /* 회원목록 조회 */
    public List<MemberDTO> selectMemberList() throws Exception {
        return memberMapper.selectMemberList();
    }

    /* 로그인 */
    public MemberDTO login(MemberDTO memberBean) throws Exception {
        return memberMapper.login(memberBean);
    }

}
