
package com.phantom.web;

import com.phantom.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * 〈一句话功能简述〉<br> 
 * 〈第二阶段用的入门类〉
 *
 * @author LLH.
 * @create 2018/6/6
 * @since 1.0.0
 */
@Controller
@RequestMapping("/hello_v1")
public class HelloControllerV1 {

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

