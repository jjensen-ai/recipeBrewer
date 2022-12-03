/* 
Project: < Recipe Brewer >
Assignment: < assignment 1 >
Author(s): < Jordon Jensen, Julio De Castro, Joseph De Gois, Benjamin Sarras >
Student Number: < 100740151, 101295616, 101317769, 101324243  >
Date: 10/23/2022
Description: This is our recipe controller that redirects to html pages related to recipes
*/

package com.recipes.recipebrewer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.recipes.recipebrewer.Model.Recipe;
import com.recipes.recipebrewer.service.RecipeServiceImpl;
@Controller
public class RecipeController {
    @Autowired
    private RecipeServiceImpl recipeRepo;
    
    @GetMapping("/recipes")
    public String getRecipes(Model model){
        model.addAttribute("recipes", recipeRepo.getRecipes());
        return "recipes";
    }

    @GetMapping("/myRecipes")
    public String myRecipes(@SessionAttribute("id") Long id, Model model){
        model.addAttribute("myRecipes", recipeRepo.findAllByAuthor(id));
        return "myRecipes";
    }

    @GetMapping("/createrecipe")
    public String addRecipe(Model model, @RequestParam(required = false) Long id){
        model.addAttribute("recipes", new Recipe());
        return "createrecipe";
    }

    @GetMapping("/updateRecipe/{id}")
    public String showUpdate(@PathVariable(value = "id") Long id, Model model){
        Recipe updateRecipe = recipeRepo.getRecipe(id);
        model.addAttribute("recipes", updateRecipe);
        return "createrecipe";
    }


    @PostMapping("/saveRecipe")
    public String saveRecipe(@ModelAttribute Recipe recipe){
        recipeRepo.saveRecipe(recipe);
        return "redirect:/recipes";
    }

    @GetMapping("/deleteRecipe")
    public String deleteRecipe(@RequestParam Long id){
        recipeRepo.deleteRecipe(id);
        return "redirect:/recipes";
    }

    @GetMapping("/mealplan")
    public String mealPlan(Model model){
        return "mealplan";
    }
}
