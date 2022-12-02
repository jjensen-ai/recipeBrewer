package com.recipes.recipebrewer.Model;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "favorites")
@Getter
@Setter
public class Favorites {
    

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "user_name")
    private User user_favorite;

    @ManyToOne
    @JoinColumn(name = "recipe_name")
    private Recipe recipe_favorite;

    
}
