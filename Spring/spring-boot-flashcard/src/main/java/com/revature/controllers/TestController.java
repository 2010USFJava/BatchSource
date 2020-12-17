package com.revature.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@GetMapping(produces=MediaType.TEXT_HTML_VALUE)
	public String testMe() {
		return "<h3>Roll Tide</h3>";
	}
}
