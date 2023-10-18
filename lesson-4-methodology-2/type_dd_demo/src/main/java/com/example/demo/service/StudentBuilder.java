package com.example.demo.service;

import com.example.demo.domain.Student;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.List;

@Validated
@Component
public class StudentBuilder {

    @Valid
    public Student create(String firstName, String lastName, String middleName, List<Integer> scores) {
        return Student.builder()
                .firstName(firstName)
                .middleName(middleName)
                .lastName(lastName)
                .scores(scores)
                .build();
    }
}
