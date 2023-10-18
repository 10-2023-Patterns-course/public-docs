package com.example.demo.domain;

import lombok.Builder;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Valid
@Builder
@ToString
public class Student {

    @Length(min = 1, max = 1000)
    private String firstName;

    @Length(min = 0, max = 1000)
    private String middleName;

    @Length(min = 1, max = 1000)
    private String lastName;

    @NotNull
    @Size(min = 1, max = 5000)
    private List<Integer> scores;


}
