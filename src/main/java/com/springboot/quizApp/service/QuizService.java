package com.springboot.quizApp.service;

import java.util.List;

import com.springboot.quizApp.entity.Quiz;

public interface QuizService {
	List<Quiz> getAll();
	Quiz save(Quiz quiz);
	Quiz findById(int id);
	List<Quiz> findOrderedByLimitedTo(int limit);
}
