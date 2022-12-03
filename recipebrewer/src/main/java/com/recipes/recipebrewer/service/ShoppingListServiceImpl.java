package com.recipes.recipebrewer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recipes.recipebrewer.Model.ShoppingList;
import com.recipes.recipebrewer.repository.ShoppingListRepo;

@Service
public class ShoppingListServiceImpl implements ShoppingListService{

    @Autowired
    ShoppingListRepo shoppingListRepo;

    @Override
    public ShoppingList getShoppingList(Long id) {
        return shoppingListRepo.findById(id).get();
    }

    @Override
    public ShoppingList saveShoppingList(ShoppingList shoppingList) {
        return shoppingListRepo.save(shoppingList);
    }

    @Override
    public void deleteShoppingList(Long id) {
        shoppingListRepo.deleteById(id);
    }

    @Override
    public ShoppingList shoppingListName(ShoppingList name) {
        return shoppingListRepo.findByIngredientName(name);
    }

    @Override
    public List<ShoppingList> getShoppingLists() {
        return (List<ShoppingList>) shoppingListRepo.findAll();
    }

    @Override
    public List<ShoppingList> findAllByAuthor(Long author) {
        return shoppingListRepo.findAllByAuthor(author);
    }


} 
