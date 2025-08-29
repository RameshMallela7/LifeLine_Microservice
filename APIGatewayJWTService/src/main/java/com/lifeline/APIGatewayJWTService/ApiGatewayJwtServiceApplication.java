package com.lifeline.APIGatewayJWTService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiGatewayJwtServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayJwtServiceApplication.class, args);
	}

}
