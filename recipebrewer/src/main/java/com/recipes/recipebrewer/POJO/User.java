package com.recipes.recipebrewer.POJO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Table;


public class User {
    private long id;
    private String email;
    private String firstName;
    private String lastName;
    private String country;
    private String province;
    private String password;


    public User(String email, String firstName, String lastName, String country, String province, String password) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.province = province;
        this.password = password;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return this.province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
