package com.recipes.recipebrewer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.recipes.recipebrewer.Model.Favorites;
import com.recipes.recipebrewer.Model.User;

@Repository
public interface FavoritesRepository extends CrudRepository<Favorites, Long> {
    @Query("SELECT f FROM Favorites f WHERE f.user = ?1")
    public List<Favorites> findFavorites(User idUser);


}
