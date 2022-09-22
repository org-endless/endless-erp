package org.endless.erp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user/signin")
public class SigninController {

    @GetMapping
    @PostMapping
    @ResponseBody
    public String signin(){
        return "OK";
    }
}
