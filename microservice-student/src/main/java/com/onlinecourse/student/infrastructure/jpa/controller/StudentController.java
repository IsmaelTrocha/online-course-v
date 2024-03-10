package com.onlinecourse.student.infrastructure.jpa.controller;

import com.onlinecourse.student.domain.entities.Student;
import com.onlinecourse.student.infrastructure.dtos.StudentDto;
import com.onlinecourse.student.infrastructure.jpa.adapter.student.GetStudentAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class StudentController {

  private final GetStudentAdapter getStudentAdapter;

  @GetMapping("/search/{studentId}")
  private ResponseEntity<StudentDto> getStudentById(@PathVariable("studentId") String studentId) {
    Student student = getStudentAdapter.findStudentByEmail(studentId);
    return new ResponseEntity<>(
        StudentDto.builder().name(student.getName()).lastName(student.getLastName())
            .email(student.getEmail()).build(), HttpStatus.OK);
  }
}
