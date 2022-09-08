package org.endless.erp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

//测试thymeleaf
@Controller
@RequestMapping("/test")
public class TestController {

    @GetMapping
    @PostMapping
    public String test(Model model) {
        model.addAttribute("msg","<h1>test spring boot!</h1>");
        model.addAttribute("eachs", Arrays.asList("each1","each2"));
        return "test";
    }
}
