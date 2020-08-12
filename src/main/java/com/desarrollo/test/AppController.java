package com.desarrollo.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@RequestMapping(value ="/")
	public static String welcome() {
		return "Welcome to Spring";
	}
}
