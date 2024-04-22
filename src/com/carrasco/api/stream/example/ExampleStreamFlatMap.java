package com.carrasco.api.stream.example;

import com.carrasco.api.stream.example.models.User;

import java.util.stream.Stream;

public class ExampleStreamFlatMap {
    public static void main(String[] args) {

        Stream<User> name = Stream
                .of("Luis Cobos", "Peter Pan","Fedor Emilianenco","Mircro Crocop",
                        "Luis Melgar", "Luis Carrasco")
                .map(nombre->new User(nombre.split(" ")[0],nombre.split(" ")[1]))
                .flatMap(u-> {
                    if(u.getName().equalsIgnoreCase("Luis")){
                        return Stream.of(u);
                    }
                    return Stream.empty();

                })
                .peek(System.out::println);

        System.out.println(name.count());



    }
}
