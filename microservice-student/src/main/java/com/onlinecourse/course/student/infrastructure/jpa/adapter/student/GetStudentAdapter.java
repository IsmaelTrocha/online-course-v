package com.onlinecourse.course.student.infrastructure.jpa.adapter.student;

import com.onlinecourse.course.student.domain.entities.Student;
import com.onlinecourse.course.student.domain.services.GetStudentService;
import com.onlinecourse.course.student.infrastructure.proxy.AuthProxy;
import com.onlinecourse.course.student.infrastructure.dtos.KeycloakUserDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GetStudentAdapter implements GetStudentService {

  private final AuthProxy authProxy;

  @Override
  public Student findStudentByEmail(String email) {
    KeycloakUserDto student = authProxy.getUserById(email);
    return new Student(student.getId(), student.getFirstName(), student.getLastName(),
        student.getEmail());
  }


}
