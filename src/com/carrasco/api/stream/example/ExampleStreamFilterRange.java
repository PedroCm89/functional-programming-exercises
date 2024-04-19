 package com.carrasco.api.stream.example;

import java.util.IntSummaryStatistics;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

 public class ExampleStreamFilterRange {
     public static void main(String[] args) throws Exception {

         IntStream numeber = IntStream.range( 5,20).peek(System.out::println);

         IntSummaryStatistics stats = numeber.summaryStatistics();

         System.out.println("max: "+stats.getMax());
         System.out.println("min: "+stats.getMin());
         System.out.println("Suma: "+ stats.getSum());
         System.out.println("Promedio: "+ stats.getAverage());
         System.out.println("Total: "+ stats.getCount());



     }
 }

