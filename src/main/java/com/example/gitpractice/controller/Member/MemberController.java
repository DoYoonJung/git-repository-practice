package com.example.gitpractice.controller.Member;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    @GetMapping("/")
    public String HelloWorld() {
        return "To-do Application !";
    }
}
