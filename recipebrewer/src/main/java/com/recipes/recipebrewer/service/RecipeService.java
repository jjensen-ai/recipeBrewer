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
