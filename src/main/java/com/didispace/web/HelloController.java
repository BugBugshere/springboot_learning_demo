package com.didispace.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

    @RequestMapping("")
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
}
