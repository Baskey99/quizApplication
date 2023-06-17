package com.springboot.quizApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.quizApp.dao.QuizRepository;
import com.springboot.quizApp.entity.Quiz;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Service
public class QuizServiceImpl implements QuizService{
	
	@PersistenceContext
    private EntityManager entityManager;
	
	@Autowired
	private QuizRepository quizRepository;

	@Override
	public List<Quiz> getAll() {
		// TODO Auto-generated method stub
		return quizRepository.findAll();
	}

	@Override
	public Quiz save(Quiz quiz) {
		
		return quizRepository.save(quiz);
		
	}

	@Override
	public Quiz findById(int id) {
		Optional<Quiz> result = quizRepository.findById(id);
		if(result.isEmpty())
			throw new RuntimeException("Did not find - "+id);
		return result.get();
	}

	@Override
	public List<Quiz> findOrderedByLimitedTo(int limit) {
		return entityManager.createQuery("SELECT q FROM Quiz q ORDER BY q.correct_answer",
		          Quiz.class).setMaxResults(limit).getResultList();
	}
		
	
	
	
}
