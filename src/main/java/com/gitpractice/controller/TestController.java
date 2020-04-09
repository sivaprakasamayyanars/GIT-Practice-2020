package com.gitpractice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController
{
	@RequestMapping("/hello")
	public String helloWorld()
	{
		
		return "Hello World Rest Controller";
	}

}
