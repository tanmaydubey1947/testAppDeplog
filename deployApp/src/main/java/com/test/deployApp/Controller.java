package com.test.deployApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.deployApp.vo.TestVOClass;

@RestController
@RequestMapping(path = "/testApp")
public class Controller {

	
	@GetMapping(path = "/testMethod", produces = "application/json")
	public String testMethod() {
		return "Application is running.";
	}
	
	@PostMapping(path = "/testPostMapping", produces = "application/json")
	public TestVOClass postMappingMethod(@RequestBody TestVOClass testVOInput) {
		
		TestVOClass testVOClass = new TestVOClass();
		
		testVOClass.setName(testVOInput.getName());
		testVOClass.setAge(testVOInput.getAge());
		
		return testVOClass;
	}
}
