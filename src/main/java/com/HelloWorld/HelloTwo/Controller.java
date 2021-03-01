package com.HelloWorld.HelloTwo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/HelloTwo")
public class Controller {

    @GetMapping(path = "/message")
    public String greetingTwo(){
        return "Hello from second Service";
    }

}
