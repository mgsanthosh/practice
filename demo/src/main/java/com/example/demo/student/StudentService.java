package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public static List<Student> getStudents() {
        return List.of(
                new Student(2001L,"Santhosh", "santhosh@yd.com", LocalDate.of(1999, Month.SEPTEMBER, 25), 23)
        );
    }
}
