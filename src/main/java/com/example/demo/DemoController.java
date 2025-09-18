package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
public class DemoController {
    @GetMapping("/hello1234")
    public String hello(Model model) {
        model.addAttribute("data", "hello!!");
        return "hello1234";
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
