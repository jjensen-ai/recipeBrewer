/* 
Project: < Recipe Brewer >
Assignment: < assignment 1 >
Author(s): < Jordon Jensen, Julio De Castro, Joseph De Gois, Benjamin Sarras >
Student Number: < 100740151, 101295616, 101317769, 101324243  >
Date: 10/23/2022
Description: This is our recipe repository that connects to crud repository
*/



package com.recipes.recipebrewer.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.recipes.recipebrewer.Model.Recipe;

@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
    Recipe findByRecipeName (Recipe recipe);
    List<Recipe> findAllByAuthor(Long author);
    
}
