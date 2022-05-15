package com.java.wiki.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
//    http://127.0.0.1:8880/hello
//    @RequestMapping("/hello")
    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}
