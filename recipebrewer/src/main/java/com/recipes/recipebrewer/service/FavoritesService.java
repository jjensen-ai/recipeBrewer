package com.recipes.recipebrewer.service;

import java.util.List;

import com.recipes.recipebrewer.Model.Favorites;
import com.recipes.recipebrewer.Model.User;

public interface FavoritesService {
    Favorites saveFavorites(Favorites favorites);
    List<Favorites> findFavorites(User user);

}
