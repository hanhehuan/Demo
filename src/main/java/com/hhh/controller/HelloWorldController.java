package com.hhh.controller;

import com.hhh.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
public class HelloWorldController {
    @RequestMapping(value = "/hello")
    public String index(){
        return "Hello World!";
    }

    @RequestMapping(value = "/showUser")
    public User showUser(){
        User user=new User();
        user.setId(1);
        user.setName("sdsd");
        user.setPassword("sdsad");
        return user;
    }

    @RequestMapping(value = "/showUsers")
    public List showUsers(){
        List<User> list =new LinkedList<User>();
        User user1=new User();
        user1.setId(2);
        user1.setName("hhh");
        user1.setPassword("123");
        User user2=new User();
        user2.setId(3);
        user2.setName("han");
        user2.setPassword("123456");
        list.add(user1);
        list.add(user2);
      return list;
    }

}
