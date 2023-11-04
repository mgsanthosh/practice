package com.santhosh.springboot.jpaandhibernate.course.jdbc;

import com.santhosh.springboot.jpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
    @Autowired
    private JdbcTemplate springJdbcTemplate;
    private static String INSERT_QUERY =
            """
            INSERT INTO COURSE (id, name, author)  values (?, ?, ?) 
            """;

    private static String SELECT_QUERY =
            """
            SELECT * FROM COURSE WHERE id = ? 
            """;

    public void insert(Course course) {
        springJdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
    }

    public Course getData(long id) {
        // ResultSet -> Bean => Row Mapper
        return springJdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class), id);
    }
}
