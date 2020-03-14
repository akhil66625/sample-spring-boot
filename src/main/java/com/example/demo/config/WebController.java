package com.example.demo.config;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	@RequestMapping("/")  
	public String get()
	{
		return "success";
	}

}
