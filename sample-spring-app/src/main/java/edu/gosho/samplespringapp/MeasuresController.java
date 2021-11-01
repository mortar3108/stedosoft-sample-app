package edu.gosho.samplespringapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
public class MeasuresController {
    public ArrayList<Measures> measures = new ArrayList<>(
            Arrays.asList(
                    new Measures(10, "КГ"),
                    new Measures(11, "БР")
            )
    );
    @GetMapping("/nomenclatures/measures")
    public ArrayList<Measures> getMeasures() {
        return measures;
    }
}
