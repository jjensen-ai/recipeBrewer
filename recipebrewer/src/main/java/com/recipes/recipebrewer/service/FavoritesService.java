package com.recipes.recipebrewer.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.recipes.recipebrewer.Model.Favorites;

@Service
public interface FavoritesService {
    Favorites getFavorites(Long id);
    Favorites saveFavorites(Favorites favorites);
    Favorites favoritesName(Favorites name);
    void deleteFavorites(Long id);
    List<Favorites> getFavorites();
    List<Favorites> findAllByUser(Long user);
}
