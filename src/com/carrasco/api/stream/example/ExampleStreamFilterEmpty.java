package com.carrasco.api.stream.example;

import com.carrasco.api.stream.example.models.User;

import java.util.Optional;
import java.util.stream.Stream;

public class ExampleStreamFilterEmpty {
    public static void main(String[] args) throws Exception {

        long count = Stream
                .of("Luis Cobos", "Peter Pan","Fedor Emilianenco","Mircro Crocop",
                        "Luis Melgar", "Luis Carrasco")
                .filter(String::isEmpty)
                .peek(System.out::println)
                .count();

        System.out.println(count);


    }
}

