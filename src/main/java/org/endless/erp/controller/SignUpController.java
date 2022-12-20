package org.endless.erp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/signup")
public class SignUpController {
    @GetMapping
    @PostMapping
    public String signup(){
        return "signup";
    }
}