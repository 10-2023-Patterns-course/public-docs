package com.example.demo.domain;

import lombok.Builder;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Valid
@Builder
public class SubjectScore {

    @Min(1)
    @Max(100)
    private Integer score;
}
