package com.study.introduction.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "about/index";
    }

    @RequestMapping("/about/project1")
    public String project1() {
        return "about/project1";
    }

    @RequestMapping("/about/project2")
    public String project2() {
        return "about/project2";
    }

    @RequestMapping("/about/project3")
    public String project3() {
        return "about/project3";
    }

    @RequestMapping("/about/project4")
    public String project4() {
        return "about/project4";
    }
}
