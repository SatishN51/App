package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@RequestMapping("/")
	public String method() {
		return "Hello from my App!!";
	}
	
	@RequestMapping("/hi")
	public String methodHi() {
		return "Hi from my App!!";
	}
}
