package com.carrasco.api.stream.example;

import com.carrasco.api.stream.example.models.User;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleStreamFilter {
    public static void main(String[] args) {

        Stream<User> name = Stream
                .of("Luis Cobos", "Peter Pan","Fedor Emilianenco","Mircro Crocop",
                        "Luis Melgar", "Luis Carrasco")
                .map(nombre->new User(nombre.split(" ")[0],nombre.split(" ")[1]))
                .filter(u-> u.getName().equalsIgnoreCase("luis"))
                .peek(u -> System.out.println(u.getName()));

        List<User> list = name.collect(Collectors.toList());
        list.forEach(u -> System.out.println(u.getSecondname()));
        //name.forEach(System.out::println);



    }
}
