package com.tretton.assignment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoriesController {

	@GetMapping("/userstories")
	public String firstStory() {
		return "first story";
	}
}
