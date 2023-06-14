package com.learning.springbootmongo.service.Impl;

import com.learning.springbootmongo.collections.Person;
import com.learning.springbootmongo.repository.PersonRepository;
import com.learning.springbootmongo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public String save(Person person) {
        return personRepository.save(person).getPersonId();
    }

    @Override
    public List<Person> getAllPerson() {
        return personRepository.findAll();
    }

    @Override
    public Person getPersonById(String id) {
        Optional<Person> byId = personRepository.findById(id);
        return byId.get();
    }

    @Override
    public List<Person> getPersonFirstNameStartsWith(String name) {
        return personRepository.findByFirstNameStartsWith(name);
    }

    @Override
    public String deleteById(String id) {
        Optional<Person> byId = personRepository.findById(id);
        if (!byId.isPresent()) {
            return "no user found with id " + id;
        }
        personRepository.deleteById(id);
        return "User with id = " + id + " and name = " + byId.get().getFirstName() + "  deleted...";
    }

    @Override
    public List<Person> getPersonByAge(int minage, int maxage) {
        return personRepository.findByAgeBetween(minage,maxage);
    }
}
