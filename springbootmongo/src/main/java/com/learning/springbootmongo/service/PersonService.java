package com.learning.springbootmongo.service;

import com.learning.springbootmongo.collections.Person;

import java.util.List;

public interface PersonService {
    String save(Person person);

    List<Person> getAllPerson();

    Person getPersonById(String id);

    List<Person> getPersonFirstNameStartsWith(String name);

    String deleteById(String id);

    List<Person> getPersonByAge(int minage, int maxage);
}
