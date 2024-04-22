package com.carrasco.api.stream.example;

import com.carrasco.api.stream.example.models.User;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class ExampleStreamListToStream {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        list.add(new User("Juan","Dominguez"));
        list.add(new User("Raul","Melgar"));
        list.add(new User("Paco","De Lucia"));
        list.add(new User("Israel","Pastrana"));
        list.add(new User("Juan","Dominguez"));
        list.add(new User("Peter","Mc Dowel"));
        list.add(new User("Peter","El Anguila"));

        list.stream().map(u->u.getName().toUpperCase()
                .concat(" ")
                .concat(u.getSecondname().toUpperCase()))
                .flatMap(name->{
                    if(name.contains("peter".toUpperCase())){
                        return Stream.of(name);
                    }
                    return Stream.empty();
                })
                .forEach(System.out::println);

    }







}
