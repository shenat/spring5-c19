package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.sat"})
@EntityScan(basePackages = "com.sat")
@SpringBootApplication
public class Spring5ActuatorC16Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring5ActuatorC16Application.class, args);
	}

}
