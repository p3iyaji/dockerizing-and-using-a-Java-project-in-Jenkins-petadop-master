package com.simplilearn.petadoption;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApplicationController {
    @RequestMapping("/")
    public String startApplication(){
        return "welcome";
    }
}
