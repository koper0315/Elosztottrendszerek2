package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping
	public String valasz() {
		
		return "valasz";
		
	}
	
	@GetMapping("/hello")
	public String perHello()
	{
		return "hello";
	}
	
}
