package com.gunin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApplicationApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationApiGatewayApplication.class, args);
	}

}
