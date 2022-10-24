/* 
Project: < Recipe Brewer >
Assignment: < assignment 1 >
Author(s): < Jordon Jensen, Julio De Castro, Joseph De Gois, Benjamin Sarras >
Student Number: < 100740151, 101295616, 101317769, 101324243  >
Date: 10/23/2022
Description: This is our recipe service interface that contain the methods to pull from the database
*/


package com.recipes.recipebrewer.service;

import com.recipes.recipebrewer.entity.Recipe;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RecipeService {
    Recipe getRecipe(Long id);
    Recipe saveRecipe(Recipe recipe);
    Recipe updateRecipe(Long id, Recipe recipe);
    Recipe recipeName(Recipe name);
    void deleteRecipe(Long id);
    List<Recipe> getRecipes();
}
