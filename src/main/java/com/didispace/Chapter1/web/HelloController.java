package com.didispace.Chapter1.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("")
    public String index(){
        return "this is a index of HELLO";
    }

    @RequestMapping("/saywhat")
    public String sayHello(){
        return "say hello";
    }
}

