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
    @JoinColumn(name = "idUser")
    private User user_favorite;

    @ManyToOne
    @JoinColumn(name = "idRecipe")
    private Recipe recipe_favorite;

    
}
