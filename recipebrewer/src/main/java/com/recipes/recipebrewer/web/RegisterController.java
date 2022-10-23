package com.recipes.recipebrewer.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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


    @RequestMapping("/login")
    public String login(Model model) {

        model.addAttribute("user", new User());
        return "login";
    } 
    

    @GetMapping("/register")
    public String registration(Model model){
        model.addAttribute("user", new User());

        return "register";
    }

    @PostMapping("/saveUser")
    public String saveUser(User user){
        userRepo.save(user);
        return "redirect:/login";
    }



}