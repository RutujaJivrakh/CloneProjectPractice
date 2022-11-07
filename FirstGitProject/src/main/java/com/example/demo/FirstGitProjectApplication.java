package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication  //(scanBasePackages = {"com.Rutuja.Controller.Sweta"})
@ComponentScan({"com.Rutuja.Controller.Punam"})
public class FirstGitProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstGitProjectApplication.class, args);
	}

}
