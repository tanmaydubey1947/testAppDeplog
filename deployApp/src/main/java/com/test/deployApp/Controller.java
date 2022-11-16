package com.test.deployApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/testApp")
public class Controller {

	
	@GetMapping(path = "/testMethod", produces = "application/json")
	public String testMethod() {
		return "Application is running";
	}
}
