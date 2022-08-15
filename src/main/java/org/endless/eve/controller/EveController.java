package org.endless.eve.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/eve")

public class EveController {

    @GetMapping
    @PostMapping
    @ResponseBody
    public String hello(){
        return "hello123456";
    }
}
