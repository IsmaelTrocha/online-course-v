package com.onlinecourse.course.infrastructure.jpa.repository.coursecontent;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseContentRepository extends JpaRepository<CourseContentDto , Long> {

  List<CourseContentDto> findAllByCourseId(Long courseId);

}
