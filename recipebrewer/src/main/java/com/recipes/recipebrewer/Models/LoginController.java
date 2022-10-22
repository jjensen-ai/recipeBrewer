package com.recipes.recipebrewer.Models;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class LoginController {
    
    @GetMapping("/login")
    public String getUser(){
        return "login";
    }

}
