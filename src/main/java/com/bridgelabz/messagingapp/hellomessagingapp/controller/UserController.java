package com.bridgelabz.messagingapp.hellomessagingapp.controller;

import com.bridgelabz.messagingapp.hellomessagingapp.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping("/hello")
    public String helloMessage(){
        return "Hello from Bridgelabz";
    }
    @GetMapping("/get")
    public String requestParam(@RequestParam String firstName){
        return "Hello "+firstName+" from Bridgelabz";
    }
    @GetMapping("/get/{firstName}")
    public String pathVariable(@PathVariable String firstName){
        return "Hello "+firstName+" from Bridgelabz";
    }
    @PostMapping("/post")
    public String postMethod(@RequestBody User user){
        return "Hello "+user.getFirstName()+" "+user.getLastName()+" from Bridgelabz";
    }
}
