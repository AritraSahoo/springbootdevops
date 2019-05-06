package com.example.springbootdevops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootDevopsController {
	
	@GetMapping(value = "/message")
	public String getMessage() {
		return "Hello Aritra";
	}

}
