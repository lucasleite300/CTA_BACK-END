package br.gov.cta.manager.api.controller;

import br.gov.cta.manager.api.model.DeleteMe;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DeleteMeController {

    @GetMapping("/hello")
    public ResponseEntity<DeleteMe> helloWorld(){

        return ResponseEntity.ok()
                .body(new DeleteMe("Hello World", 1101));
    }
}
