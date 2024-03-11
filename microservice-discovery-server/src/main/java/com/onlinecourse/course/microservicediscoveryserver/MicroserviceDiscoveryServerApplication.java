package com.onlinecourse.course.microservicediscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceDiscoveryServerApplication.class, args);
	}

}
