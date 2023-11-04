package com.santhosh.springboot.jpaandhibernate.course.jdbc;

import com.santhosh.springboot.jpaandhibernate.course.Course;
import com.santhosh.springboot.jpaandhibernate.course.jpa.CourseJpaRepository;
import com.santhosh.springboot.jpaandhibernate.course.springDataJpa.CourseSpringDataJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseJdbcRepository courseJdbcRepository;

    @Autowired
    private CourseJpaRepository courseJpaRepository;

    @Autowired
    private CourseSpringDataJpa courseSpringDataJpa;


    @Override
    public void run(String... args) throws Exception {
        Course course = new Course(2, "Angular 1123", "Santhosh");
        courseJdbcRepository.insert( new Course(2, "Angular 1123", "Santhosh"));
        courseJdbcRepository.insert( new Course(3, "Angular 1123", "Santhosh"));
        courseJdbcRepository.insert( new Course(4, "Angular 1123", "Santhosh"));
        courseJdbcRepository.insert( new Course(5, "Angular 1123", "Santhosh"));
        System.out.println(courseJdbcRepository.getData(2));


        courseJpaRepository.insert(new Course(6, "Angular JPA", "Santhosh JPA"));
        courseJpaRepository.insert(new Course(7, "Angular JPA", "Santhosh JPA"));
        courseJpaRepository.insert(new Course(8, "Angular JPA", "Santhosh JPA"));
        courseJpaRepository.insert(new Course(9, "Angular JPA", "Santhosh JPA"));
        System.out.println(courseJpaRepository.findById(8));


        courseSpringDataJpa.save(new Course(10, "Angular Spring JPA", "Santhosh Spring JPA"));
        courseSpringDataJpa.deleteById(9l);
        System.out.println(courseSpringDataJpa.findById(10l));

    }
}
