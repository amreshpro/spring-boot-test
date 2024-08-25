package com.notes.app.Journal.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicController {

    @GetMapping
    ResponseEntity<String> isWorking(){
        return new ResponseEntity<>("Hii Spring Boot", HttpStatus.OK);

    }
}
