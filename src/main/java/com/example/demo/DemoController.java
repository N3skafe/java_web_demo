package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
public class DemoController {
    @GetMapping("/hello1")
    public String hello1() {
        return "hello1";
    }
    @GetMapping("/hello2")
    public String hello2() {
        return "hello2";
    }
    @GetMapping("/about_detailed")
    public String about() {
        return "about_detailed";
    }
    @GetMapping("/index")
    public String index() {
        return "index";
    }
    
}
