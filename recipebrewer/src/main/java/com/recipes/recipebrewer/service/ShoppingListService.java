package com.recipes.recipebrewer.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.recipes.recipebrewer.Model.ShoppingList;

@Service
public interface ShoppingListService {
    ShoppingList getShoppingList(Long id);
    ShoppingList saveShoppingList(ShoppingList shoppingList);
    void deleteShoppingList(Long id);
    ShoppingList shoppingListName(ShoppingList name);
    List<ShoppingList> getShoppingLists();
    List<ShoppingList> findAllByAuthor(Long author);
}
