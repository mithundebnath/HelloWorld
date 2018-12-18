package com.helloworld.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	@RequestMapping(value="/helloController",produces={"application/json"})
	public String Show() {
		return "{\"status\":\"I am here\"}";
	}
}
