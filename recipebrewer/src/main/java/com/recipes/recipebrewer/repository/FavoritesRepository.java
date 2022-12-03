package com.recipes.recipebrewer.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.recipes.recipebrewer.Model.Favorites;

@Repository
public interface FavoritesRepository extends CrudRepository<Favorites, Long> {
    Favorites findByUserId (Favorites favorites);

    List<Favorites> findAllByUserId(Long user);
}
    
