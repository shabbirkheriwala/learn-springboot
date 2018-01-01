package com.learn.springboot.hcmapp.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String sayHello() {
		return "<h1>Hello World! SpringBoot HCM App</h1>";
	}
}
