package edu.gosho.samplespringapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
public class RegionsController {
    private ArrayList<Regions> regions = new ArrayList<>(
            Arrays.asList(
                    new Regions(10, "region1"),
                    new Regions(11, "region2")
            )
    );
    @GetMapping("/nomenclatures/regions")
    public ArrayList<Regions> getRegions() {
        return regions;
    }
}
