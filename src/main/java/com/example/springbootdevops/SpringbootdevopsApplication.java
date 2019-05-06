package com.example.springbootdevops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.*")
public class SpringbootdevopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdevopsApplication.class, args);
	}

}
