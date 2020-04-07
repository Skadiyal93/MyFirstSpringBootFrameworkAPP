package com.Satish.Satish_firstspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Restcontroller {
	
	@GetMapping("/")
	
	public String Hello_world()
	{
		return "Hello Welcome";
		
	
	}

}
