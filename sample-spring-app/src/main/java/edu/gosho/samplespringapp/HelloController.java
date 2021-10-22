package edu.gosho.samplespringapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
public class HelloController {
    private ArrayList<Hello> items = new ArrayList<>(
            Arrays.asList(
                    new Hello(10, "12121212", "airqn"),
                    new Hello(11, "00451212", "airqn 500")
            )
    );

    @GetMapping("/nomenclatures/items")
    public ArrayList<Hello> getItems() {
        return items;
    }
}
