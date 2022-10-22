package com.recipes.recipebrewer.Models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import com.recipes.recipebrewer.entity.User;
import com.recipes.recipebrewer.repository.UserRepository;

@Controller
public class RegisterController{

    @Autowired
    private UserRepository userRepo;

    // @GetMapping({"/profile", "/"})
    // public ModelAndView getAllUsers() {
    //     ModelAndView mav = new ModelAndView("list-employees");
    //     mav.addObject("register", userRepo.findAll());
    //     return mav;
    // }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/register")
    public ModelAndView addUser(){
        ModelAndView mav = new ModelAndView("register");
        User newUser = new User();
        mav.addObject("user", newUser);
        return mav;
    }

    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute User user){
        userRepo.save(user);
        return "redirect:/login";
    }



}