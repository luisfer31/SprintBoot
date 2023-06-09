package com.example.demo.config;

import com.example.demo.model.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student luis_m = new Student(
                    1L,
                    "LuisM",
                    "luis@gmail.com",
                    LocalDate.of(1978, Month.APRIL, 02)
            );

            Student vale_m = new Student(
                    2L,
                    "ValentinaM",
                    "vale@gmail.com",
                    LocalDate.of(2017, Month.APRIL, 20)
            );
            repository.saveAll(
                    List.of(luis_m, vale_m)
            );
        };
    }


}
