package edu.gosho.samplespringapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
public class UsersController {
    private ArrayList<Users> users = new ArrayList<>(
            Arrays.asList(
                    new Users(10, "user1"),
                    new Users(11, "user2")
            )
    );
    @GetMapping("/nomenclatures/users")
    public ArrayList<Users> getUsers() {
        return users;
    }
}
