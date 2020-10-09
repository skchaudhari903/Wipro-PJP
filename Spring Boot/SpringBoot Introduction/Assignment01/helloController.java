package com.abhishek.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

	@RequestMapping("/hello")
	public String hello() {
		System.out.println("Hello!");
		return "Hello World";
	}
}
