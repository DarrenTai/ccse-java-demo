package com.ctg.ccsecicddemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloCcseController {
    @RequestMapping("/index")
    public String sayHello() {
        return "index";
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello CCSE. This is a CICD demo.";
    }
}
