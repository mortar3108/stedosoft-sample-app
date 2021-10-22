package edu.gosho.samplespringapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
public class ItemsController {
    private ArrayList<Items> items = new ArrayList<>(
            Arrays.asList(
                    new Items(10, "12121212", "airqn"),
                    new Items(11, "00451212", "airqn 500")
            )
    );

    @GetMapping("/nomenclatures/items")
    public ArrayList<Items> getItems() {
        return items;
    }
}
