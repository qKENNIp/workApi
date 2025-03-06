package org.example.workapi.service;

import org.example.workapi.Entity.EntityPerson;
import org.example.workapi.Entity.PersonRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
@Service
public class SqlUsing {
    private PersonRepository personRepository;

    public SqlUsing(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<EntityPerson> SqlShowUser(ArrayList<EntityPerson> entityPeople) {
        return personRepository.findAll();
    }
}
