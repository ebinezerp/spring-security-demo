package com.learning.springsecuritydemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {


    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/register") // get
    public String register(){
        return "register";
    }

    @GetMapping("/admin/home")
    public String adminHome(){
        return "index";
    }

    @GetMapping("/admin/contact")
    public String adminContact() {
        return "admincontact";
    }

    @GetMapping("/user/home")
    public String userHOme(){
        return "userhome";
    }

    @GetMapping("/user/contact")
    public String userContact(){
        return  "usercontact";
    }

    @GetMapping("/common")
    public String commonPage(){
        return "common";
    }
}
