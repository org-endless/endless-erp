package org.endless.erp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.util.StringUtils;

/**
*@ClassName SigninController
*@Description 登录页面提交后跳转控制器
*@Author EndlessError
*@Date 2022/11/17 17:09
*@Version
*/
@Controller
@RequestMapping("/user/signin")
public class SigninController {

    @GetMapping
    @PostMapping
    public String signin(@RequestParam("username") String username, @RequestParam("password") String password, Model model) {
        if (!StringUtils.isEmpty(username) && "123456".equals(password)) {
            System.out.println("123");
            return "index";
        } else {
            model.addAttribute("msg", "用户名或密码错误！");
            return "signin";
        }
    }
}
