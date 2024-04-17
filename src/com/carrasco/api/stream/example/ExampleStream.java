package com.carrasco.api.stream.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

        List<String> nameGroup = new ArrayList<>();
        nameGroup.add("Rum DMC");
        nameGroup.add("Doble V");
        nameGroup.add("El canto del loco");
        nameGroup.add("CPV");

        //Stream<String>name3 = nameGroup.stream();
        //name3.forEach(System.out::println);

        nameGroup.stream().forEach(System.out::println);

    }
}
