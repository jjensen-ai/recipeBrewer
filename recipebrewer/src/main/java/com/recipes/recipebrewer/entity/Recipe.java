/* 
Project: < Recipe Brewer >
Assignment: < assignment 1 >
Author(s): < Jordon Jensen, Julio De Castro, Joseph De Gois, Benjamin Sarras >
Student Number: < 100740151, 101295616, 101317769, 101324243  >
Date: 10/23/2022
Description: This is our recipe pojo class that contains the recipe attributes
*/


package com.recipes.recipebrewer.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import org.springframework.context.annotation.Bean;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "recipes")
public class Recipe {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "recipe_name", nullable = false)
    private String recipeName;
    @Column(name = "ingredient", nullable = false)
    private String ingredient;
    @Column(name = "instructions", nullable = false)
    private String instructions;
    @Column(name = "cookTime", nullable = false)
    private String cookTime;

}
