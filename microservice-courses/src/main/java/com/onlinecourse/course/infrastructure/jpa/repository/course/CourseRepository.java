package com.onlinecourse.course.infrastructure.jpa.repository.course;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<CourseDto, Long> {

}
