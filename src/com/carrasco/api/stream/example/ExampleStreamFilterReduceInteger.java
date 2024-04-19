 package com.carrasco.api.stream.example;

import java.util.stream.Stream;

 public class ExampleStreamFilterReduceInteger {
     public static void main(String[] args) throws Exception {

         Stream<Integer> numeber = Stream.of( 5,7,48,126,4,78,9);

         System.out.println(numeber.reduce(0,(a,b)->a+b));



     }
 }

