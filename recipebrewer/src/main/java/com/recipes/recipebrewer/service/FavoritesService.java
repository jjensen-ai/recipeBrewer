package com.recipes.recipebrewer.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.recipes.recipebrewer.Model.Favorites;
import com.recipes.recipebrewer.Model.User;

@Service
public interface FavoritesService {
    Favorites saveFavorites(Favorites object);
    List<Favorites> findFavorites(User user);

}
