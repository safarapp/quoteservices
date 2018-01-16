package com.jkm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	 @RequestMapping("/")
	    public String home() {
		 	//TODO:load application reference data
	        return "Greetings from Spring Boot!";
	    }
}
