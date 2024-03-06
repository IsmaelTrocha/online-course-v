package com.onlinecourse.student.domain.services;

import com.onlinecourse.student.domain.entities.Student;

public interface GetStudentService {

  Student findStudentByEmail(String email);

}
