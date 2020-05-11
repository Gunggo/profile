package com.study.introduction.member.mapper;

import com.study.introduction.member.bean.MemberBean;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface MemberMapper {

    /* 로그인 */
    MemberBean login (MemberBean memberBean) throws Exception;

    /* 회원목록 조회 */
    List<MemberBean> selectMemberList() throws Exception;

}
