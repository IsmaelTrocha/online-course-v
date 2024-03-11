package com.onlinecourse.course.student.domain.services;

import com.onlinecourse.course.student.domain.entities.Student;

public interface GetStudentService {

  Student findStudentByEmail(String email);

}
