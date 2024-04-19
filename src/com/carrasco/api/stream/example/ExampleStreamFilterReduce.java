 package com.carrasco.api.stream.example;

import java.util.stream.Stream;

public class ExampleStreamFilterReduce {
    public static void main(String[] args) throws Exception {

        Stream<String> names = Stream.of("Luis Cobos","Luis Cobos", "Peter Pan","Fedor Emilianenco","Mircro Crocop",
                        "Luis Melgar","Peter Pan","Luis Carrasco")
                .distinct();

        System.out.println(names.reduce("Result concat ",(a,b)->a+"# "+b));



    }
}

