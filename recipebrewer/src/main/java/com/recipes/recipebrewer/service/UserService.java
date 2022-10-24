package com.recipes.recipebrewer.service;

import com.recipes.recipebrewer.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    User getUser(Long id);
    User saveUser(User user);
    User findByUsername(String username);
    User findByEmail(String email);
    User findByPassword(String password);
    void deleteUser(Long id);
    List<User> getUsers();
}
