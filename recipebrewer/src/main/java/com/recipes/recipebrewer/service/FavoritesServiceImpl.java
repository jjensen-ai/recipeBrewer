package com.recipes.recipebrewer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.recipes.recipebrewer.Model.Favorites;
import com.recipes.recipebrewer.Model.User;
import com.recipes.recipebrewer.repository.FavoritesRepository;

public class FavoritesServiceImpl implements FavoritesService{

    @Autowired
    FavoritesRepository favoritesRepository;
    
    @Override
    public Favorites saveFavorites(Favorites favorites) {
        return favoritesRepository.save(favorites);
    }

    @Override
    public List<Favorites> findFavorites(User user) {
        return favoritesRepository.findUser(user);
    }

}
