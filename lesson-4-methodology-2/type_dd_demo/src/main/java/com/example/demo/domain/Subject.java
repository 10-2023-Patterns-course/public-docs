package com.example.demo.domain;

import lombok.Builder;
import org.hibernate.validator.constraints.Length;

import javax.validation.Valid;

@Valid
@Builder
public class Subject {

    @Length(min = 2, max = 1000)
    private String name;
}
