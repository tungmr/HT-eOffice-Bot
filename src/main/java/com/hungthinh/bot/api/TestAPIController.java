package com.hungthinh.bot.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestAPIController {

    @GetMapping("/api/test")
    public String test(){
        return "working!!!";
    }
}
