package edu.gosho.samplespringapp;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
public class OrderController {
    public ArrayList<Order> orders = new ArrayList<>(
                Arrays.asList(
                        new Order(123, 10, new ArrayList<>(
                                Arrays.asList(
                                        new OrderItems(1, "12-289-19", "18.10.2021", 12, 11),
                                        new OrderItems(2, "12-289-19", "18.10.2021", 12, 12)
                                )
                        )
                )
    ));
    public ArrayList<OrderResponseItems> selectedResponseItems = new ArrayList<>(
            Arrays.asList(
                    new OrderResponseItems(19, 12, 12)
            )
    );//kakvo ni trqbva za zaqvkata; OrderResponse za kakvo e
    @PostMapping("/action/order")
    public ArrayList<Order> postOrders(@RequestBody ProformaDocument proformaDocument /*tova qvno e zaqvkata, koqto az bqh napravil, vupreki che ima razlichni parametri?*/) {
        return orders;
    }
}
