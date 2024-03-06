package com.onlinecourse.student.infrastructure.jpa.adapter;

import com.onlinecourse.student.domain.entities.Student;
import com.onlinecourse.student.domain.services.GetStudentService;
import com.onlinecourse.student.infrastructure.dtos.*;
import io.micrometer.observation.Observation;
import io.micrometer.observation.ObservationRegistry;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@AllArgsConstructor
public class GetStudentAdapter implements GetStudentService {

  private final WebClient.Builder webClientBuilder;
  private final ObservationRegistry observationRegistry;

  @Override
  public Student findStudentByEmail(String email) {
    Observation usersObservation = Observation.createNotStarted("microservice-users",
        observationRegistry);
    BaseResponse result = this.webClientBuilder.build()
        .get()
        .uri(uriBuilder -> uriBuilder
            .path("http://localhost:8082/api/users/search/")
            .queryParam("{username}", email)
            .build())
        .retrieve()
        .bodyToMono(BaseResponse.class)
        .block();

    return null;
  }

}
