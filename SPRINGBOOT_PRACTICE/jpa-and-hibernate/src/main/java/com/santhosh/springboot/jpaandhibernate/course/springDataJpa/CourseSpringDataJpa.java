package com.santhosh.springboot.jpaandhibernate.course.springDataJpa;

import com.santhosh.springboot.jpaandhibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpa extends JpaRepository<Course, Long> {
}
