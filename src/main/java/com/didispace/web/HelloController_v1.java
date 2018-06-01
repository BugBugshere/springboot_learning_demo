
package com.didispace.web;

        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello_v1")
public class HelloController_v1 {

    @RequestMapping("")
    public String index(){
        return "this is a index of HELLO";
    }

    @RequestMapping("/saywhat")
    public String sayHello(){
        return "say hello";
    }
}

