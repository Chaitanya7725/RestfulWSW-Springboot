package com.chaitanya.springbootdemo.controller;

import com.chaitanya.springbootdemo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "Hello World";
    }

    @GetMapping("/user")
    public User user(){
        User user = new User();
        user.setId("1");
        user.setName("Chaitanya");
        user.setEmail("chaitanya7725@gmail.com");
        return user;
    }

    @GetMapping("/{id}/{id2}")
    public String pathVariable(@PathVariable String id,@PathVariable("id2") String second){
        return "The passed path variable is "+id+" "+second;
    }

    @RequestMapping("/requestParam")
    public String requestParams(@RequestParam String name,@RequestParam(value="emailId",required = false,defaultValue = "") String email){
        return "The name is : "+name+" and email id "+email;
    }

}
