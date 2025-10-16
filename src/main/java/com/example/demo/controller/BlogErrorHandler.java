package com.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor

@ControllerAdvice
public class BlogErrorHandler {
    @ExceptionHandler({MethodArgumentTypeMismatchException.class, IllegalArgumentException.class})
    public String handleException(Exception ex, Model model) {
        model.addAttribute("errorMessage", "잘못된 요청입니다: " + ex.getMessage());
        return "error_page/add_error";
    }
}