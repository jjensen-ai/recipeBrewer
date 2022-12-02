package com.recipes.recipebrewer.Controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.recipes.recipebrewer.Model.User;
import com.recipes.recipebrewer.service.UserService;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    // Hanlder method to handle home page request
    @GetMapping("/")
    public String home() {
        return "login";
    }

    @RequestMapping("/login")
    public String login(
        @RequestParam("email") String email,
        @RequestParam("password") String password,
        HttpSession session,
        ModelMap modelMap){

            User user = userService.findByEmail(email);

            if(user != null){
              String sessionEmail = user.getEmail();
              String sessionPassword = user.getPassword();
              Long userId = user.getId();  

                if(email.equals(sessionEmail) && password.equals(sessionPassword)){
                    session.setAttribute("id", userId);
                    return "recipes";
                }
                else{
                    modelMap.put("Error", "Invalid Account");
                    return "login";
                }
            }
            else{
                modelMap.put("Error", "Invalid Account");
                    return "login";
            }
        }

    // @GetMapping("/register")
    // public String showRegistrationForm(Model model) {
 
    //     return "register";
    // }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, ModelMap modelMap) {
        if (result.hasErrors()) {
            return "register";
        }
        else{
            userService.saveUser(user);
            modelMap.put("Success", "User Registered Successfully");
            return "login";
        }
    }
    

    
}
