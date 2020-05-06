package com.study.introduction.about;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AboutController {

    @GetMapping("/about/{projectNo}/project")
    public String project(@PathVariable("projectNo") String projectNo) {

        return "/about/project" + projectNo ;
    }

}
