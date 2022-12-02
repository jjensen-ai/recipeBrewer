package com.recipes.recipebrewer.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.recipes.recipebrewer.Model.Favorites;
import com.recipes.recipebrewer.Model.User;

public interface FavoritesRepository extends CrudRepository<Favorites, Long> {
    Favorites findByRecipeId(Long recipeId);

    Favorites findByUserId(Long userId);

    List<Favorites> findUser(User user);


}
