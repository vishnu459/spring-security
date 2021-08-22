package com.practice.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class UserController {

    @GetMapping("/")
    public String home() {
        return "Welcome home...!";
    }

    @GetMapping("/user")
    public String user() {
        return "Welcome user...!";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Welcome admin...!";
    }
}
