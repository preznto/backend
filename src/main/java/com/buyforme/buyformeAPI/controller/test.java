package com.buyforme.buyformeAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class test {

    @GetMapping("/")
    public String test() {
        return "test2";
    }

}
