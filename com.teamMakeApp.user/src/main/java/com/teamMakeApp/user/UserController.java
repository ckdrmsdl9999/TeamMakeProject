package com.teamMakeApp.user;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users/")
public class UserController {

    @GetMapping
    public String getUser(){
        return "Hello iam changgeun";
    }


}
