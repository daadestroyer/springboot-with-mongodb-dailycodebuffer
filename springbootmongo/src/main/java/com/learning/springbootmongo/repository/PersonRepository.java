package com.learning.springbootmongo.repository;

import com.learning.springbootmongo.collections.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends MongoRepository<Person,String> {
    List<Person> findByFirstNameStartsWith(String name);

    List<Person> findByAgeBetween(int min,int max);
}
