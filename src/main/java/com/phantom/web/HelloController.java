package com.phantom.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 〈一句话功能简述〉<br> 
 * 〈入口类〉
 *
 * @author LLH.
 * @create 2018/6/6
 * @since 1.0.0
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    public String index(ModelMap map){

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
