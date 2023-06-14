package com.learning.springbootmongo.controller;

import com.learning.springbootmongo.collections.Person;
import com.learning.springbootmongo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping
    public String save(@RequestBody Person person){
        return personService.save(person);
    }

    @GetMapping
    public List<Person> getAllPerson(){
        return personService.getAllPerson();
    }

    @GetMapping("/{id}")
    public Person getPersonByID(@PathVariable String id){
        return personService.getPersonById(id);
    }
}
