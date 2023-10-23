package ru.patterns.homework3.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import ru.patterns.homework3.domain.dto.StudentDto;
import ru.patterns.homework3.domain.entity.Student;

import javax.validation.constraints.NotNull;

@Validated
@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentDto create(@NotNull StudentDto studentDto) {
        //лень делать маппер
        var student = new Student();
        student.setName(studentDto.getName());

        var s = studentRepository.saveAndFlush(student);

        //лень делать маппер
        var result = new StudentDto();
        result.setId(student.getId());
        result.setName(student.getName());
        return result;
    }
}
