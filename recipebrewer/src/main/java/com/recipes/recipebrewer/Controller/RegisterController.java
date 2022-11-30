package com.recipes.recipebrewer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.recipes.recipebrewer.entity.User;
import com.recipes.recipebrewer.service.UserService;

@Controller
@RequestMapping({"", "/", "/register"})
public class RegisterController {
    
    @Autowired
    private UserService userService;

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

}