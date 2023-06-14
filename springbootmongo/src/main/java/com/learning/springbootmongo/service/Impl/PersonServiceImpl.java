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
}
