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

    @PostMapping("/save-person")
    public String save(@RequestBody Person person) {
        return personService.save(person);
    }

    @GetMapping("/get-all")
    public List<Person> getAllPerson() {
        return personService.getAllPerson();
    }

    @GetMapping("/{id}")
    public Person getPersonByID(@PathVariable String id) {
        return personService.getPersonById(id);
    }

    @GetMapping
    public List<Person> getPersonStartsWith(@RequestParam String name) {
        return personService.getPersonFirstNameStartsWith(name);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable String id) {
        return personService.deleteById(id);
    }

    @GetMapping("/age")
    public List<Person> getPersonByAge(@RequestParam int minage, @RequestParam int maxage) {
        return personService.getPersonByAge(minage, maxage);
    }
}
