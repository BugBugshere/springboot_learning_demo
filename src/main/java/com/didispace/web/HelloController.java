package com.didispace.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String index(ModelMap map){
        //map.addAttribute("host","http://www.bilibili.com");
        map.put("host","http://www.bilibili.com");
        return "index";
    }

    @ResponseBody
    @RequestMapping("/hello/saywhat")
    public String sayHello(){
        return "say hello";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginPost() {
        return "hello";
    }
}
