package com.example.hrmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.hrmanagement")
public class HrManagementSystemApplication {
	public static void main(String[] args) {
		SpringApplication.run(HrManagementSystemApplication.class, args);
	}

}
