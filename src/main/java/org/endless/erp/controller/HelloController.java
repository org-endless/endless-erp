package org.endless.erp.controller;

import org.springframework.web.bind.annotation.*;

/**
*@ClassName HelloController
*@Description Hello页面跳转控制器
*@Author EndlessError
*@Date 2022/11/17 17:14
*@Version 
*/
@RestController
@RequestMapping("/erp_hello")
public class HelloController {

    @GetMapping
    @PostMapping
    @ResponseBody
    public String hello() {
        return "hello";
    }
}
