package com.jenkinsapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class JenkinsappController {
	@GetMapping("/get")
	public String get() {
		return "Success";
	}
}
