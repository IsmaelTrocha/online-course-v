package com.course.users.infrastructure.jpa.adapter;

import com.course.users.config.keycloak.KeycloakProvider;
import com.course.users.domain.service.IKeycloakService;
import com.course.users.infrastructure.dto.UserDTO;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.ws.rs.core.Response;
import lombok.extern.slf4j.Slf4j;
import org.keycloak.OAuth2Constants;
import org.keycloak.admin.client.resource.RolesResource;
import org.keycloak.admin.client.resource.UserResource;
import org.keycloak.admin.client.resource.UsersResource;
import org.keycloak.representations.idm.CredentialRepresentation;
import org.keycloak.representations.idm.RoleRepresentation;
import org.keycloak.representations.idm.UserRepresentation;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KeycloakServiceImpl implements IKeycloakService {

    /**
     * Metodo para listar todos los usuarios de Keycloak
     * @return List<UserRepresentation>
     */
    public List<UserRepresentation> findAllUsers(){
        return KeycloakProvider.getRealmResource()
                .users()
                .list();
    }

    /**
     * Metodo para buscar un usuario por su username
     * @return List<UserRepresentation>
     */
    public List<UserRepresentation> searchUserByUsername(String username) {
        return KeycloakProvider.getRealmResource()
                .users()
                .searchByUsername(username, true);
    }

    /**
     * Metodo para crear un usuario en keycloak
     * @return String
     */
    public String createUser(@NonNull UserDTO userDTO) {

        UserRepresentation userRepresentation = getUserRepresentation(userDTO);

        UsersResource usersResource = getUsersResource();

      Response response = usersResource.create(userRepresentation);

      if (Objects.equals(201, response.getStatus())) {
            List<UserRepresentation> representationList = usersResource.searchByUsername(
                userDTO.getEmail(), true);
   //         emailVerification(userRepresentation.getId());
            if (userDTO.getRoles().contains("TEACHER")) {
                assignRoleToUser(userRepresentation.getId(), "TEACHER");
            } else {
                assignRoleToUser(userRepresentation.getId(), "USER");
            }
        }

        return "User registered successfully!!";
    }

    private static UserRepresentation getUserRepresentation(UserDTO userDTO) {
        UserRepresentation userRepresentation = new UserRepresentation();
        userRepresentation.setFirstName(userDTO.getFirstName());
        userRepresentation.setLastName(userDTO.getLastName());
        userRepresentation.setEmail(userDTO.getEmail());
        userRepresentation.setUsername(userDTO.getEmail());
        userRepresentation.setEnabled(true);
        userRepresentation.setEmailVerified(false);

        CredentialRepresentation credentialRepresentation = new CredentialRepresentation();
        credentialRepresentation.setValue(userDTO.getPassword());
        credentialRepresentation.setType(CredentialRepresentation.PASSWORD);
        credentialRepresentation.setTemporary(Boolean.FALSE);

        List<CredentialRepresentation> credentialRepresentationList = new ArrayList<>();
        credentialRepresentationList.add(credentialRepresentation);
        userRepresentation.setCredentials(credentialRepresentationList);
        return userRepresentation;
    }

    private void emailVerification(String userId) {
        UsersResource usersResource = getUsersResource();
        usersResource.get(userId).sendVerifyEmail();
    }

    private RoleRepresentation getRole(String role) {
        RolesResource rolesResource = getRolesResource();
        return rolesResource.get(role).toRepresentation();
    }

    private RolesResource getRolesResource() {
        return KeycloakProvider
            .getRealmResource()
            .roles();
    }

    private void assignRoleToUser(String userId, String role) {
        UsersResource usersResource = getUsersResource();
        UserResource userResource = usersResource.get(userId);
        RoleRepresentation representation = getRole(role);
        userResource.roles().realmLevel().add(Collections.singletonList(representation));
    }


    /**
     * Metodo para borrar un usuario en keycloak
     * @return void
     */
    public void deleteUser(String userId){
        KeycloakProvider.getUserResource()
                .get(userId)
                .remove();
    }


    public UserRepresentation getUserRepresentation(String email) {
        UsersResource userResource = KeycloakProvider.getUserResource();
        userResource.searchByUsername(email, true);
        return userResource.get(email).toRepresentation();
    }


    public UsersResource getUsersResource() {
        return KeycloakProvider.getUserResource();
    }

    /**
     * Metodo para actualizar un usuario en keycloak
     * @return void
     */
    public void updateUser(String userId, @NonNull UserDTO userDTO){

        CredentialRepresentation credentialRepresentation = new CredentialRepresentation();
        credentialRepresentation.setTemporary(false);
        credentialRepresentation.setType(OAuth2Constants.PASSWORD);
        credentialRepresentation.setValue(userDTO.getPassword());

        UserRepresentation user = new UserRepresentation();
        user.setUsername(userDTO.getUsername());
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setEmail(userDTO.getEmail());
        user.setEnabled(true);
        user.setEmailVerified(true);
        user.setCredentials(Collections.singletonList(credentialRepresentation));

        UserResource usersResource = KeycloakProvider.getUserResource().get(userId);
        usersResource.update(user);
    }
}
