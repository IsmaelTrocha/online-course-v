package com.course.users.infrastructure.dto;

import java.io.Serializable;
import java.util.Set;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.Value;

@Data
@RequiredArgsConstructor
@Builder
public class UserDTO implements Serializable {

    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private Set<String> roles;

}
