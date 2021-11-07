package edu.gosho.samplespringapp.web.nomenklaturi;

import edu.gosho.samplespringapp.domain.Contractors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
public class ContractorsController {
    private ArrayList<Contractors> contractors = new ArrayList<>(
            Arrays.asList(
                    new Contractors(10, "contractor1"),
                    new Contractors(11, "contractor2")
            )
    );
    @GetMapping("/nomenclatures/contractors")
    public ArrayList<Contractors> getContractors() {
        return contractors;
    }
}
