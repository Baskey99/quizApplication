package com.springboot.quizApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.quizApp.entity.Quiz;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Integer> {

}
