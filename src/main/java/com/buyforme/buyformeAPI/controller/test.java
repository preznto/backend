package com.buyforme.buyformeAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {

    @GetMapping("/api")
    public String test() {
        return "test2";
    }

}
