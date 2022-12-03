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

import com.recipes.recipebrewer.Model.ShoppingList;

@Repository
public interface ShoppingListRepo extends CrudRepository<ShoppingList, Long> {

    ShoppingList findByIngredientName(ShoppingList ingredientName);
    // List<ShoppingList> getShoppingLists(Long author);
    List<ShoppingList> findAllByAuthor(Long author);
}
