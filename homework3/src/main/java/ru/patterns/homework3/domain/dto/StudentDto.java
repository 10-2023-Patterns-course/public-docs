package ru.patterns.homework3.domain.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class StudentDto implements Serializable {

    private UUID id;

    private String name;

    private List<SubjectDto> subjects;

}
