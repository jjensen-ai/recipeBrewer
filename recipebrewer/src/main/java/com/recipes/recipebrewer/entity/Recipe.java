package com.recipes.recipebrewer.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


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
    private String directions;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
}
