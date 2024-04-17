package com.carrasco.api.stream.example;

import com.carrasco.api.stream.example.models.User;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleStreamMap {
    public static void main(String[] args) {

        Stream<User> name = Stream
                .of("Luis Cobos", "Peter Pan","Fedor Emilianenco","Mircro Crocop")
                .map(nombre->new User(nombre.split(" ")[0],nombre.split(" ")[1]))
                .peek(u -> System.out.println(u.getName()))
                .map((user -> {
                    String n = user.getName();
                    user.setName(n);
                    return user;
                }));

        List<User> list = name.collect(Collectors.toList());
        list.forEach(u -> System.out.println(u.getSecondname()));
        //name.forEach(System.out::println);



    }
}
