package com.example.demo.controller;

import java.util.List; // List import 추가 java 자료구조
import java.util.Optional; // Optional import 추가 java 자료구조

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.domain.Article;
import com.example.demo.model.service.AddArticleRequest;
import com.example.demo.model.service.BlogService; // 최상단 서비스 클래스 연동 추가(BlogService)

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;



@RequiredArgsConstructor
@Controller
public class BlogController {
    @Autowired
    BlogService blogService; // DemoController 클래스 아래 객체 생성

    // @GetMapping("/article_list")
    // public String article_list() {
    //     return "article_list";
    // }
    @GetMapping("/article_list") // 게시판 링크 지정
    public String article_list(Model model) {
        List<Article> list = blogService.findAll(); // 게시판 리스트 list type return
        model.addAttribute("articles", list); // 모델에 추가
    return "article_list"; // .HTML 연결
    }
    @PostMapping("/api/articles") // post 요청
    public String addArticle(@ModelAttribute AddArticleRequest request) { // 아직없음(에러)
        Article saveArticle= blogService.save(request); // 게시글저장
        ResponseEntity.status(HttpStatus.CREATED).body(saveArticle); // 상태코드및게시글정보반환
        return "redirect:/article_list"; 
    }
    @GetMapping("/favicon.ico")
        public void favicon() {
        // 아무 작업도 하지 않음
    }
    @GetMapping("/article_edit/{id}") // 게시판링크지정
    public String article_edit(Model model, @PathVariable Long id) {
        Optional<Article> list = blogService.findById(id); // 선택한게시판글
        if (list.isPresent()) {
            model.addAttribute("article", list.get()); // 존재하면Article 객체를모델에추가
        } else {
            // 처리할로직추가(예: 오류페이지로리다이렉트, 예외처리등)
            return "/error_page/article_error"; // 오류 처리 페이지로 연결(이름 수정됨)
        }
    return "article_edit"; // .HTML 연결
    }
    @PutMapping("/api/article_edit/{id}")
    public String updateArticle(@PathVariable Long id, @ModelAttribute AddArticleRequest request) {
        blogService.update(id, request);
        return "redirect:/article_list"; // 글 수정 이후 .html 연결
    }
    @DeleteMapping("/api/article_delete/{id}")
    public String deleteArticle(@PathVariable Long id) {
        blogService.delete(id);
        return "redirect:/article_list";
    }
}