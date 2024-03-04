package com.course.users.domain.service;

import com.course.users.infrastructure.dto.UserDTO;
import java.util.List;
import org.keycloak.representations.idm.UserRepresentation;

public interface IKeycloakService {

    List<UserRepresentation> findAllUsers();
    List<UserRepresentation> searchUserByUsername(String username);
    String createUser(UserDTO userDTO);
    void deleteUser(String userId);
    void updateUser(String userId, UserDTO userDTO);
}
