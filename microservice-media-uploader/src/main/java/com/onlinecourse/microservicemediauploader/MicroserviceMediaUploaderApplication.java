package com.onlinecourse.microservicemediauploader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroserviceMediaUploaderApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceMediaUploaderApplication.class, args);
	}

}


