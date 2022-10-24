package com.recipes.recipebrewer.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "username", nullable = false)
    @NotEmpty(message = "Please provide a username")
    @Size(min = 2, message = "Username is too short")
    @NotNull
    private String username;
    @Column(name = "first_name", nullable = false)
    @NotEmpty(message = "Please provide your first name")
    @NotNull
    private String firstName;
    @Column(name = "last_name", nullable = false)
    @NotEmpty(message = "Please provide your last name")
    @NotNull
    private String lastName;
    @Column(name = "email", nullable = false)
    @NotEmpty(message = "Please provide your email")
    @NotNull
    @Email(message = "Please provide a valid email")
    private String email;
    @Column(name = "password", nullable = false)
    @NotNull
    @NotEmpty(message = "Please provide a password")
    @Size(min = 6, message = "Password is too short")
    private String password;

}
