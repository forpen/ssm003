package com.jjz.controller;


import com.jjz.pojo.MyUser;
import com.jjz.service.MyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
public class MyUserController {
    @Autowired
    private MyUserService myUserService;
    @RequestMapping("/select")
    public String selectbyname(MyUser myUser, Model model){
        List<MyUser> list=myUserService.findUserByName(myUser);
        model.addAttribute("users",list);
        return "userList";
    }
}
