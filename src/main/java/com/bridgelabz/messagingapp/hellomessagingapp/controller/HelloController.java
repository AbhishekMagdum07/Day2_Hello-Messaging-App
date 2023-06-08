package com.bridgelabz.messagingapp.hellomessagingapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //Uc1 - Create rest controller to show hello message to the user.
    @GetMapping("/hello")
    public String helloMessage(){
        return "Hello from Bridgelabz";
    }
}
