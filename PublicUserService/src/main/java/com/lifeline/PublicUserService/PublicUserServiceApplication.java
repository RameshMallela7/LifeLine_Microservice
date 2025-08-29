package com.lifeline.PublicUserService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PublicUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PublicUserServiceApplication.class, args);
	}

}
