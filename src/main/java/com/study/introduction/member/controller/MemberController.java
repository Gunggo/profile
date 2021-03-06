package com.study.introduction.member.controller;

import com.study.introduction.member.dto.MemberDTO;
import com.study.introduction.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    private final MemberService memberService;

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

        List<MemberDTO> memberList = memberService.selectMemberList();
        model.addAttribute("memberList", memberList);

        return "/test";
    }
}

