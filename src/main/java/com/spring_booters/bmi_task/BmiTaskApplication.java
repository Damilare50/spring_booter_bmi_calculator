package com.spring_booters.bmi_task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.validation.annotation.Validated;

@SpringBootApplication
@Validated
public class BmiTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(BmiTaskApplication.class, args);
	}

}
