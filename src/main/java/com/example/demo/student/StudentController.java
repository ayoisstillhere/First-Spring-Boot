package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path="api/v1/student")
public class StudentController {
    @GetMapping
    public List<Student> getStudents() {
        return  List.of(
                new Student(
                        1L,
                        "Ayodele",
                        "afagbami@gmail.com",
                        LocalDate.of(2002, Month.AUGUST,26),
                        19
                ),
                new Student(
                        2L,
                        "Mildred",
                        "millie@gmail.com",
                        LocalDate.of(2002, Month.JANUARY,21),
                        20
                )
        );
    }
}
