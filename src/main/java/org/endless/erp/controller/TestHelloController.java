package org.endless.erp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class TestHelloController {

    @GetMapping
    @PostMapping
    @ResponseBody
    public String hello() {
        return "hello";
    }
}
