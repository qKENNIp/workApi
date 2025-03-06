package org.example.workapi.controller;


import org.example.workapi.Entity.EntityPerson;
import org.example.workapi.Entity.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Controller {
    @Autowired
    private PersonRepository personRepository;

    @PostMapping("/submit")
    public void doPost(@RequestBody EntityPerson entityPerson) {
        personRepository.save(entityPerson);
    }
}
