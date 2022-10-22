package com.recipes.recipebrewer.Models;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RecipeController {
    
    @GetMapping("/createrecipe")
    public String getRecipe(){
       return "createrecipe"; 
    }

}
