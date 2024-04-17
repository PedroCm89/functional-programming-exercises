package com.carrasco.api.stream.example;

import java.util.Arrays;
import java.util.stream.Stream;

import static java.util.stream.DoubleStream.builder;

public class ExampleStream {
    public static void main(String[] args) {

        Stream<String> name = Stream.of("Luis", "Peter","Fedor","Mircro");
        name.forEach(System.out::println);

        String[] nameArray = {"Wanderley","Remy","Marck","Ramon","Don Free"};
        name = Arrays.stream(nameArray);
        name.forEach(System.out::println);

        Stream<String> name2 = Stream.<String>builder()
                .add("Bob")
                .add("Zigui")
                .add("Damian")
                .build();
        name2.forEach(System.out::println);

    }
}
