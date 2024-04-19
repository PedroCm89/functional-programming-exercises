package com.carrasco.api.stream.example;

import com.carrasco.api.stream.example.models.User;

import java.util.Optional;
import java.util.stream.Stream;

public class ExampleStreamFilterDistinct {
    public static void main(String[] args) throws Exception {

        Stream<String> names = Stream
                .of("Luis Cobos","Luis Cobos", "Peter Pan","Fedor Emilianenco","Mircro Crocop",
                        "Luis Melgar","Peter Pan","Luis Carrasco")
                .distinct();

        names.forEach(System.out::println);



    }
}

