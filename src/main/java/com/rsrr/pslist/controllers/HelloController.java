package com.rsrr.pslist.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {
    
    @GetMapping("/index")
    public String index() {
        return "index";
    }
}