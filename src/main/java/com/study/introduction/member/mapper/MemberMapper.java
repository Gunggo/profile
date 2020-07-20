package com.study.introduction.member.mapper;

import com.study.introduction.member.dto.MemberDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface MemberMapper {

    /* 로그인 */
    MemberDTO login (MemberDTO memberBean) throws Exception;

    /* 회원목록 조회 */
    List<MemberDTO> selectMemberList() throws Exception;

}
