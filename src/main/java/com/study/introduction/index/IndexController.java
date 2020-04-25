package com.study.introduction.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/project1")
    public String project1() {
        return "project1";
    }

    @RequestMapping("/project2")
    public String project2() {
        return "project2";
    }

    @RequestMapping("/project3")
    public String project3() {
        return "project3";
    }

    @RequestMapping("/project4")
    public String project4() {
        return "project4";
    }
}
