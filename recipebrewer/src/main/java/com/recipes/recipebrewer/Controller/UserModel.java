/* 
Project: < Recipe Brewer >
Assignment: < assignment 1 >
Author(s): < Jordon Jensen, Julio De Castro, Joseph De Gois, Benjamin Sarras >
Student Number: < 100740151, 101295616, 101317769, 101324243  >
Date: 10/23/2022
Description: This is our user controller that redirects to html pages related to users such as login and registration
*/



package com.recipes.recipebrewer.Controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.recipes.recipebrewer.entity.User;
import com.recipes.recipebrewer.service.UserService;
import com.recipes.recipebrewer.service.UserServiceImpl;

@Controller
public class UserModel {
    @Autowired
    private UserService userService;

    // HttpSession
    private HttpSession userSession;
    
    @GetMapping("/profile")
    public String profile(Model model){
        return "profile";
    }
    
    // @GetMapping("/loginSuccess")
    // public String loginSuccess(Model model){
    //     return "recipes";
    // }
    // @PostMapping("/loginSuccess")
    // public String loginSuccess(User user, HttpSession session, HttpServlet request) {
    //     // invalidate session
    //     session.invalidate();

    //     // create new session
        
    // }

    @PostMapping("/submitItem")
    public String handleSubmitLog(@Valid User user, BindingResult result) {
        if (result.hasErrors()) return "login";
        return "redirect:/register";
    }

    @PostMapping("/register/submitItem")
    public String handleSubmit(@Valid User user, BindingResult result) {
        if (result.hasErrors()) return "register";
        return "redirect:/";
    }

}
