   package com.carrasco.api.stream.example;

import com.carrasco.api.stream.example.models.User;

import java.io.StringBufferInputStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

 public class ExampleStreamDistinctUserSum {
     public static void main(String[] args) throws Exception {

         IntStream names = Stream
                 .of("Luis Cobos", "Peter Pan","Fedor Emilianenco","Mircro Crocop",
                         "Luis Melgar","Luis Cobos", "Luis Carrasco")
                 .map(nombre->new User(nombre.split(" ")[0],nombre.split(" ")[1]))
                 .distinct()
                 .mapToInt(u->u.toString().length());

         names.forEach(System.out::println);




     }
 }

