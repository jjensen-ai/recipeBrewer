package com.recipes.recipebrewer.service;

import com.recipes.recipebrewer.entity.Recipe;
import com.recipes.recipebrewer.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeServiceImpl implements RecipeService{

    @Autowired
    RecipeRepository recipeRepository;


    @Override
    public Recipe getRecipe(Long id) {
        return null;
    }

    @Override
    public Recipe saveRecipe(Recipe recipe) {
        return null;
    }

    @Override
    public void deleteRecipe(Long id) {

    }

    @Override
    public List<Recipe> getRecipes() {
        return null;
    }
}