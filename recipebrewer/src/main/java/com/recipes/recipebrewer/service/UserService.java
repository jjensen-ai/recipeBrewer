package com.recipes.recipebrewer.service;

import com.recipes.recipebrewer.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    User getUser(Long id);
    User saveUser(User user);
    void deleteUser(Long id);
    List<User> getUsers();
}
