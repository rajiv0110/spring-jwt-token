package com.rajiv.jwt.jwtauthentication.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/welcome")
	public String greeting() {
		String text = "Not allowed for unauthneticated user";
		return text;

	}
}
