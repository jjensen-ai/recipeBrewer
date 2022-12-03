package com.recipes.recipebrewer.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ShoppingList")
public class ShoppingList {
    
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "ingredientName", nullable = false)
    private String ingredientName;
    @Column(name = "amount", nullable = false)
    private int amount;
    @Column(name = "units", nullable = false)
    private String units;
    @Column(name = "author")
    private long author;
}
