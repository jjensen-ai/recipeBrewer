package com.recipes.recipebrewer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recipes.recipebrewer.Model.Favorites;
import com.recipes.recipebrewer.Model.User;
import com.recipes.recipebrewer.repository.FavoritesRepository;

@Service
public class FavoritesServiceImpl implements FavoritesService{

    @Autowired
    FavoritesRepository favoritesRepository;
    
    @Override
    public Favorites saveFavorites(Favorites object) {
        return favoritesRepository.save(object);
    }

    @Override
    public List<Favorites> findFavorites(User user) {
        return favoritesRepository.findFavorites(user);
    }

}
