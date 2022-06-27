package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student Ayodele = new Student(
                    "Ayodele",
                    "afagbami@gmail.com",
                    LocalDate.of(2002, AUGUST,26),
                    19
            );
            Student mildred = new Student(
                    "Mildred",
                    "millie@gmail.com",
                    LocalDate.of(2002, Month.JANUARY,21),
                    20
            );

            repository.saveAll(List.of(Ayodele, mildred));
        };
    }
}
