package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.domain.TestDB;
import com.example.demo.model.service.TestService; // 최상단 서비스 클래스 연동 추가




@Controller
public class DemoController {
    @Autowired
    TestService testService; // DemoController 클래스 아래 객체 생성

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
    @GetMapping("/test1")
    public String thymeleaf_test1(Model model) {
    model.addAttribute("data1", "<h2> 방갑습니다 </h2>");
    model.addAttribute("data2", "태그의 속성 값");
    model.addAttribute("link", 01);
    model.addAttribute("name", "홍길동");
    model.addAttribute("para1", "001");
    model.addAttribute("para2", 002);
        return "thymeleaf_test1";
    }
    @GetMapping("/testdb")
    public String getAllTestDBs(Model model) {
    TestDB test = testService.findByName("홍길동");
    model.addAttribute("data4", test);
    System.out.println("데이터 출력 디버그 : " + test);
    TestDB test2 = testService.findByName("아저씨");
    model.addAttribute("data5", test2);
    System.out.println("데이터 출력 디버그 : " + test2);
    TestDB test3 = testService.findByName("꾸러기");
    model.addAttribute("data6", test3);
    System.out.println("데이터 출력 디버그 : " + test3);
        return "testdb";
    }
}
