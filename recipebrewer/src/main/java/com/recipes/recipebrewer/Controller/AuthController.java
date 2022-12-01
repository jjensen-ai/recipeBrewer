package com.recipes.recipebrewer.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.recipes.recipebrewer.dto.UserDto;
import com.recipes.recipebrewer.entity.User;
import com.recipes.recipebrewer.service.UserService;

@Controller
public class AuthController {

    @Autowired
    UserService userService;

    // Hanlder method to handle home page request
    @GetMapping("/index")
    public String home() {
        return "index";
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        // Create model object to store form data
        UserDto user = new UserDto();
        model.addAttribute("user", user);
        return "register";
    }

    @PostMapping("/register/save")
    public String registration(@Valid @ModelAttribute("user") UserDto userDto,
    BindingResult result, Model model) {
        User existingUser = userService.findByUsername(userDto.getUsername());

        if (existingUser != null) {
            result.rejectValue("username", null, "There is already an account registered with that username");
        }

        if(result.hasErrors()){
            model.addAttribute("user", userDto);
            return "/register";
        }

        userService.saveUser(userDto);
        return "redirect:/register?success";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
    
}
