package com.onlinecourse.course.infrastructure.config.jwt;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.security.oauth2.server.resource.authentication.JwtGrantedAuthoritiesConverter;
import org.springframework.stereotype.Component;

@Component
public class JwtAuthenticationConverter implements Converter<Jwt, AbstractAuthenticationToken> {

  private final JwtGrantedAuthoritiesConverter jwtGrantedAuthoritiesConverter =
      new JwtGrantedAuthoritiesConverter();


  @Override
  @NonNull
  public AbstractAuthenticationToken convert(@NonNull Jwt jwt) {

    Collection<GrantedAuthority> authorities = Stream
        .concat(jwtGrantedAuthoritiesConverter.convert(jwt).stream(),
            extractResourceRoles(jwt).stream())
        .toList();

    return new JwtAuthenticationToken(jwt, authorities, null);
  }


  private Collection<? extends GrantedAuthority> extractResourceRoles(Jwt jwt) {

    Collection<String> resourceRoles;

    Map<String, Object> resourceAccess = jwt.getClaim("realm_access");

    resourceRoles = (Collection<String>) resourceAccess.get("roles");
    return resourceRoles
        .stream()
        .map(role -> new SimpleGrantedAuthority("ROLE_" + role))
        .collect(Collectors.toSet());
  }
}

