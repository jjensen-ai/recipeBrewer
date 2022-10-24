package com.recipes.recipebrewer.repository;

import com.recipes.recipebrewer.entity.Recipe;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
    Recipe findByRecipeName (Recipe recipe);
}
