package com.example.githubactions;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class dis {
	@GetMapping("/")
	public String va() {
		return "hrllo";
	}
}
