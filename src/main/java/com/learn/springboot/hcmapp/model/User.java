package com.learn.springboot.hcmapp.model;

import javax.persistence.*;

@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "user_id")
    private int id;
    @Column (name = "name")
    private String name;
    @Column (name = "last_name")
    private String last_name;
    @Column (name = "email")
    private String email;
    @Column (name = "password")
    private String password;

    public User() {}

    public User (User argUser) {
        name = argUser.getName();
        last_name = argUser.getLast_name();
        email = argUser.getEmail();
        password = argUser.getPassword();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
