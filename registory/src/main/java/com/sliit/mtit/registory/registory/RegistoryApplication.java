package com.sliit.mtit.registory.registory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegistoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistoryApplication.class, args);
	}

}
