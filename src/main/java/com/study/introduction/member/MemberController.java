package com.study.introduction.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

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
}
