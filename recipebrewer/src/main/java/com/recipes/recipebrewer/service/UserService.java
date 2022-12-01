/* 
Project: < Recipe Brewer >
Assignment: < assignment 1 >
Author(s): < Jordon Jensen, Julio De Castro, Joseph De Gois, Benjamin Sarras >
Student Number: < 100740151, 101295616, 101317769, 101324243  >
Date: 10/23/2022
Description: This is our user service interface that contain the methods to pull from the database
*/



package com.recipes.recipebrewer.service;

import com.recipes.recipebrewer.dto.UserDto;
import com.recipes.recipebrewer.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    // User getUser(Long id);
    // User saveUser(User user);
    // User findByUsername(String username);
    // User findByEmail(String email);
    // User findByPassword(String password);
    // void deleteUser(Long id);

    // // This checks if the users is in the database
    // // boolean checkUser(User user);

    // List<User> getUsers();
    void saveUser(UserDto userDto);
    User findByUsername(String username);
    List<UserDto> findAllUsers();
}
