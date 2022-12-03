package com.recipes.recipebrewer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recipes.recipebrewer.repository.FavoritesRepository;
import com.recipes.recipebrewer.Model.Favorites;

@Service
public class FavoritesServiceImpl implements FavoritesService {

    @Autowired
    FavoritesRepository favoritesRepository;
    
    @Override
    public Favorites getFavorites(Long id) {
        return favoritesRepository.findById(id).get();
    }

    @Override
    public Favorites saveFavorites(Favorites favorites) {
        return favoritesRepository.save(favorites);
    }

    @Override
    public Favorites favoritesName(Favorites name) {
        return favoritesRepository.findByUserId(name);
    }

    @Override
    public void deleteFavorites(Long id) {
        favoritesRepository.deleteById(id);
    }

    @Override
    public List<Favorites> getFavorites() {
        return (List<Favorites>) favoritesRepository.findAll();
    }

    @Override
    public List<Favorites> findAllByUser(Long user) {
        return favoritesRepository.findAllByUserId(user);
    }
}
    

