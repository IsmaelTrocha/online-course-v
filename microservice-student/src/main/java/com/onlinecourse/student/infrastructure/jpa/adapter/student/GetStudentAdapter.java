package com.onlinecourse.student.infrastructure.jpa.adapter.student;

import com.onlinecourse.student.domain.entities.Student;
import com.onlinecourse.student.domain.services.GetStudentService;
import com.onlinecourse.student.infrastructure.dtos.KeycloakUserDto;
import com.onlinecourse.student.infrastructure.proxy.AuthProxy;
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
