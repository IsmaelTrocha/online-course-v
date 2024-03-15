package com.onlinecourse.course.infrastructure.config.locale;

import java.util.Locale;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

@Configuration
public class LocaleConfig {

  @Bean
  public AcceptHeaderLocaleResolver getLocaleResolver() {
    AcceptHeaderLocaleResolver getLocaleResolver = new AcceptHeaderLocaleResolver();
    getLocaleResolver.setDefaultLocale(Locale.getDefault());
    return getLocaleResolver;
  }

}
