package com.carrasco.api.stream.example.models;

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
    public String toString() {
        return  name + '\'' +
                secondname ;
    }
}
