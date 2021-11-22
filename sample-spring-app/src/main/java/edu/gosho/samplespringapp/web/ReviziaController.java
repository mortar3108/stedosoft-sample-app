package edu.gosho.samplespringapp.web;

import edu.gosho.samplespringapp.domain.common.ResponseType;
import edu.gosho.samplespringapp.domain.common.ServerResponse;
import edu.gosho.samplespringapp.domain.priemaneklient.SingleDokumentBlankaZaVarnataStokaOtKlient;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/revizia", produces = "application/json; charset=utf-8", consumes = "application/json; charset=utf-8")
public class ReviziaController {

    @PutMapping(value = "otchitane-na-dokument-obrazec")
    public ServerResponse otchitaneNaDokumentObrazec(@RequestBody SingleDokumentBlankaZaVarnataStokaOtKlient blanka) {
        return new ServerResponse(ResponseType.SUCCESS,blanka);
    }


}
