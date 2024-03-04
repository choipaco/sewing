package org.example.sewing.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloApiController {

    @GetMapping("/hello")
    public String getHello(){
        return "Hello";
    }

}
