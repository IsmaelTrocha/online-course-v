package com.onlinecourse.course.infrastructure.jpa.repository.video;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepository extends JpaRepository<VideoDto, Long> {

  @Query(nativeQuery = true, value = "SELECT * FROM VIDEOS where course_content_id = :courseContent")
  List<VideoDto> findAllByCourseContentId(Long courseContent);

}
