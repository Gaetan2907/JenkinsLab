package com.example.JenkinsLab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// Add comment to trigger github webhook
public class JenkinsLabApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsLabApplication.class, args);
	}

}
