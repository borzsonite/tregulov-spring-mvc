package com.zaurtregulov.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/")
    public String showFirstView () {
        return "first-view";
    }

    @RequestMapping("/ask-details")
    public String askDetails () {
        return "ask-details";
    }

    @RequestMapping("show-details")
    public String showDetails () {
        return "show-details";
    }


}
