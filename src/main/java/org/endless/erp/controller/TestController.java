package org.endless.erp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
*@ClassName TestController
*@Description 测试视图跳转控制器，主要测试thymeleaf
*@Author EndlessError
*@Date 2022/11/17 17:10
*@Version
*/
@Controller
@RequestMapping("/test")
public class TestController {
    //
    // @GetMapping
    // @PostMapping
    // public String test(Model model) {
    //     model.addAttribute("msg","<h1>test spring boot!</h1>");
    //     model.addAttribute("eachs", Arrays.asList("each1","each2"));
    //     return "test";
    // }
}
