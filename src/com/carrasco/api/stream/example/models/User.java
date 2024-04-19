package com.carrasco.api.stream.example.models;

import java.util.Objects;

public class User {

    private String name;
    private String secondname;
    private Integer id;
     private static int ultimoId;

    public User(String name, String secondname) {
        this.name = name;
        this.secondname = secondname;
        this.id= ultimoId++;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(secondname, user.secondname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, secondname);
    }

    @Override
    public String toString() {
        return  name + " " + secondname ;
    }
}
