package edu.gosho.samplespringapp.web.nomenklaturi;

import edu.gosho.samplespringapp.domain.nomenklaturi.Artikul;
import edu.gosho.samplespringapp.domain.nomenklaturi.ListArtikuli;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
public class ArtikuliController {
    private ArrayList<Artikul> items = new ArrayList<>(
            Arrays.asList(
                    new Artikul(10, "12121212", "airqn", 1),
                    new Artikul(11, "00451212", "airqn 500" ,2)
            )
    );

    @PostMapping("/nomenklaturi/artikuli")
    public ListArtikuli getItems() {
        var artikuli = new ListArtikuli();
        artikuli.artikuli = items;
        return artikuli;
    }
}
