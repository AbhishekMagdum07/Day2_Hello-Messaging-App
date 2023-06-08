package com.bridgelabz.messagingapp.hellomessagingapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String helloMessage(){
        return "Hello from Bridgelabz";
    }
    @GetMapping("/get")
    public String requestParam(@RequestParam String firstName){
        return "Hello "+firstName+" from Bridgelabz";
    }


}
