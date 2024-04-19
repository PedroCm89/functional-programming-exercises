 package com.carrasco.api.stream.example;

import com.carrasco.api.stream.example.models.User;

import java.util.Optional;
import java.util.stream.Stream;

public class ExampleStreamDistinctUser {
    public static void main(String[] args) throws Exception {

        Stream<User> names = Stream
                .of("Luis Cobos", "Peter Pan","Fedor Emilianenco","Mircro Crocop",
                        "Luis Melgar","Luis Cobos", "Luis Carrasco")
                .map(nombre->new User(nombre.split(" ")[0],nombre.split(" ")[1]))
                .distinct();

        names.forEach(System.out::println);




    }
}

