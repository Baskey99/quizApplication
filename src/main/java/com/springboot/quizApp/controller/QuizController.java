package com.springboot.quizApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.quizApp.entity.Quiz;
import com.springboot.quizApp.service.QuizService;

@RestController
@RequestMapping("/api")
public class QuizController {
	
	@Autowired
	private QuizService quizService;
	
	@GetMapping("/list")
	public List<Quiz> getListOfQues(){		
		return quizService.getAll();
	}
	
	@GetMapping("/list/{quizId}")
	public Quiz findById(@PathVariable int quizId) {
		return quizService.findById(quizId);
	}
	
	@PostMapping("/save")
	public Quiz saveQuiz(@RequestBody Quiz quiz){
		quiz.setId(0);
		Quiz dbQuiz = quizService.save(quiz);
		return dbQuiz;
	}
	
	@GetMapping("/getSearchResult")
	public List<Quiz> get(@RequestParam String id) {
		
		return quizService.findOrderedByLimitedTo(Integer.parseInt(id));
	}
}
