package com.springboot.quizApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	// create a mapping for "/hello"
		
	@GetMapping("/start")
	public String startQuiz() {
		
		return "/quizs/index";
	}
}








