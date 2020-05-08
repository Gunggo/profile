package com.study.introduction.member.dao;

import com.study.introduction.member.bean.MemberBean;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberDao {

    /* 회원목록 조회 */
    @Select("SELECT * FROM member")
    public List<MemberBean> selectMemberList() throws Exception;

}
