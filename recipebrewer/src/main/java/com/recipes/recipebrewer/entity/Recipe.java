package com.recipes.recipebrewer.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "recipes")
@Getter
@Setter
public class Recipe {
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private long id;
    private String ingredient;
    private String cookTime;
    private String directions;

}
