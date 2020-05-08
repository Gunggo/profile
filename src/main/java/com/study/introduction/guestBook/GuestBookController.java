package com.study.introduction.guestBook;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GuestBookController {

    @GetMapping("/guestBook")
    public String guestBook() {
        return "/guestBook";
    }
}
