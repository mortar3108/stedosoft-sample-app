package edu.gosho.samplespringapp;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
public class OrderController {
    public ArrayList<SelectedItems> selectedItems = new ArrayList<>(
            Arrays.asList(
                    new SelectedItems(1, "12-289-19", "18.10.2021", 12, 11),
                    new SelectedItems(2, "12-289-19", "18.10.2021", 12, 12)
            )
    );
    public ArrayList<Order> order = new ArrayList<>(
        Arrays.asList(
                new Order(123, 10, selectedItems.get(0)),
                new Order(124, 11, selectedItems.get(1))
        )
    );
}
