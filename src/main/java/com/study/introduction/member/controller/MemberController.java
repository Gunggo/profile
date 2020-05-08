package com.study.introduction.member.controller;

import com.study.introduction.member.bean.MemberBean;
import com.study.introduction.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MemberController {

    @Autowired
    MemberService memberService;

    @GetMapping("/login")
    public String login() {
        return "/login";
    }

    @GetMapping("/join")
    public String join() {
        return "/join";
    }

    @GetMapping("/forgot")
    public String findUserInfo() {
        return "/forgot";
    }

    @GetMapping("/test")
    public String test(Model model) throws Exception{

        List<MemberBean> memberList = memberService.selectMemberList();
        model.addAttribute("memberList", memberList);

        return "/test";
    }
}
