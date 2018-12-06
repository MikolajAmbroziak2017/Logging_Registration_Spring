package com.petinder.server.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/")
    public String main() {
        return"strona glowna";
    }

    @GetMapping("/test")
    public String main2(){return "test"; }

    @GetMapping("/test2")
    public String main3(){return "testowy nie logowany"; }

}