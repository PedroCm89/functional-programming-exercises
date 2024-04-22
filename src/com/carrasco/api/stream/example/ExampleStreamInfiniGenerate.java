package com.carrasco.api.stream.example;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class ExampleStreamInfiniGenerate {
    public static void main(String[] args) {

        AtomicInteger count = new AtomicInteger(0);

        Stream.generate(()->{
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    return count.incrementAndGet()
;                }).limit(5)
                .forEach(System.out::println);
    }
}
