package com.learning.springbootmongo.collections;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;
import java.util.List;

@Data
@Builder
@Document(collection = "person")
public class Person {
    @Id
    private String personId;
    private String firstName;
    private String lastName;
    private int age;
    private List<String> hobbies;
    private List<Address> addresses;
}
