package com.inventory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	String message = "Welcome to your 1st Maven Spring project !";  
	  
    @RequestMapping("/dashboard")  
    public ModelAndView dashboard() {  
        System.out.println("from controller");  
        return new ModelAndView("dashboard", "message", message);  
    }  
}
