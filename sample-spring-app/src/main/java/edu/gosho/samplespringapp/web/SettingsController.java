package edu.gosho.samplespringapp.web;

import edu.gosho.samplespringapp.domain.common.StaticVariables;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/settings", produces = "application/json; charset=utf-8")
public class SettingsController {

    @GetMapping("artikuli")
    public void setItems(@RequestParam int count) {
        StaticVariables.setArtikulsCount(count);
    }
    @GetMapping("paketirane")
    public void setПaketirane(@RequestParam int count) {
        StaticVariables.setPaketiraneCount(count);
    }


}
