package com.rahul.org.samples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringBootEmployeeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEmployeeServiceApplication.class, args);
	}

}
