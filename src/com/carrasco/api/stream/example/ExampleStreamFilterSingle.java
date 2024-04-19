package com.carrasco.api.stream.example;

import com.carrasco.api.stream.example.models.User;

import java.util.Optional;
import java.util.stream.Stream;

public class ExampleStreamFilterSingle {
    public static void main(String[] args) throws Exception {

        Stream<User> names = Stream
                .of("Luis Cobos", "Peter Pan","Fedor Emilianenco","Mircro Crocop",
                        "Luis Melgar", "Luis Carrasco")
                .map(nombre->new User(nombre.split(" ")[0],nombre.split(" ")[1]))
                .filter(u-> u.getName().equals("Luis"))
                .peek(System.out::println);

        Optional<User> user = names.findFirst();
        //System.out.println(user.orElse(new User("Jack","Sparrow")));
        /*System.out.println(user.orElseThrow(()->{
            Exception e = new Exception("user not found");
            return e;
        }));*/
        if(user.isPresent()){
            System.out.println(user.get());
        }else{
            System.out.println("user not found");
        }




    }
}

