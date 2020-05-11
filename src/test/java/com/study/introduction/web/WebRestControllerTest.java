package com.study.introduction.web;

import com.study.introduction.member.bean.MemberBean;
import com.study.introduction.member.service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class WebRestControllerTest {

    @Autowired
    private MemberService memberService;

    @Test
    public void USER_MAPPER_TEST() throws Exception {
        List<MemberBean> user = memberService.selectMemberList();

        System.out.println(user);

    }
}
