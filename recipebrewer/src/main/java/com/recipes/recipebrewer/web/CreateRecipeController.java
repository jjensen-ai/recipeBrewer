package com.recipes.recipebrewer.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.recipes.recipebrewer.entity.Recipe;
import com.recipes.recipebrewer.repository.RecipeRepository;

@Controller
public class CreateRecipeController {

    @Autowired
    private RecipeRepository recipeRepo;
    
    @GetMapping("/createrecipe")
    public ModelAndView addRecipe(){
        ModelAndView mav = new ModelAndView("createrecipe");
        Recipe newRecipe = new Recipe();
        mav.addObject("recipe", newRecipe);
       return mav; 
    }

    @PostMapping("/saveRecipe")
    public String saveRecipe(@ModelAttribute Recipe recipe){
        recipeRepo.save(recipe);
        return "redirect:/login";
    }

}
