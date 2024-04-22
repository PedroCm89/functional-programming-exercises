package com.carrasco.api.stream.example;

import com.carrasco.api.stream.example.models.Invoices;
import com.carrasco.api.stream.example.models.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExerciseStreamFlatMapInvoices {
    public static void main(String[] args) {
        User luis = new User("Luis","Ferra");
        User carlos = new User("Carlos","Ferra");

        luis.addInvoice(new Invoices("buy xbox"));
        luis.addInvoice(new Invoices("buy computer"));

        carlos.addInvoice(new Invoices("buy table"));
        carlos.addInvoice(new Invoices("buy mouse"));

        List<User> userList = Arrays.asList(luis,carlos);

        userList.stream().flatMap(user -> user.getInvoices().stream())
                .forEach(i-> System.out.println(i.getDescription().concat(" cliente:")
                        .concat(i.getUser().toString())));

    }

}
