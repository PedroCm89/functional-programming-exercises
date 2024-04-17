package com.carrasco.api.stream.example;

import com.carrasco.api.stream.example.models.User;

import java.util.stream.Stream;

public class ExampleSteamFilterAnyMatch {

    public static void main(String[] args) {

        boolean exists = Stream
                .of("Luis Cobos", "Peter Pan","Fedor Emilianenco","Mircro Crocop",
                        "Luis Melgar", "Luis Carrasco")
                .map(nombre->new User(nombre.split(" ")[0],nombre.split(" ")[1]))
                .peek(System.out::println)
                .anyMatch(u-> u.getId().equals(3));

        System.out.println(exists);

    }
}

