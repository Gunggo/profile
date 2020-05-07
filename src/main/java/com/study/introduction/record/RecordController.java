package com.study.introduction.record;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RecordController {

    @GetMapping("/record")
    public String record() {
        return "/record/recordList";
    }
}
