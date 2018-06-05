
package com.didispace.web;

import com.didispace.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@Controller
@RequestMapping("/hello_v1")
public class HelloController_v1 {

    @RequestMapping("/")
    public String index() throws Exception {
        throw new MyException("发生错误");

    }

    @ResponseBody
    @RequestMapping("/saywhat")
    public String sayHello(){
        return "say hello";
    }


    @ResponseBody
    @RequestMapping("/saymimi")
    public String syaException() throws MyException {
        throw new MyException("发生系统错误了");
    }
}

