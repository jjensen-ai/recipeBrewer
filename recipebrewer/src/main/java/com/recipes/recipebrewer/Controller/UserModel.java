package com.recipes.recipebrewer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.recipes.recipebrewer.entity.User;
import com.recipes.recipebrewer.service.UserServiceImpl;

@Controller
public class UserModel {
    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/")
    public String login(Model model) {

        return "login";
    }

    @GetMapping("/profile")
    public String profile(Model model){
        return "profile";
    }
    
    
    @GetMapping("/register")
    public String addUser(Model model){
       model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute User user){
    
        userService.saveUser(user);
        return "redirect:/";
    }

    @GetMapping("/loginSuccess")
    public String loginSuccess(Model model){
        return "recipes";
    }

}
