package com.client.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@GetMapping("/rabin")
	public String hello() {
		return "hello world";
		
	}
	

}
