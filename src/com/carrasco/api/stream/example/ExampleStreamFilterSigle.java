package com.carrasco.api.stream.example;

import com.carrasco.api.stream.example.models.User;

import java.util.stream.Stream;

public class ExampleStreamFilterSigle {
    public static void main(String[] args) {

        User user = Stream
                .of("Luis Cobos", "Peter Pan","Fedor Emilianenco","Mircro Crocop",
                        "Luis Melgar", "Luis Carrasco")
                .map(nombre->new User(nombre.split(" ")[0],nombre.split(" ")[1]))
                .filter(u-> u.getId().equals(3))
                .findFirst().get();

        System.out.println(user);




    }
}

