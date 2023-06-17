package com.springboot.quizApp.entity;

import java.util.Arrays;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="quiz")
public class Quiz {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="answer")
	private String answer;
	
	@Column(name="question")
	private String question;
	
	@Column(name="wrong_answer")
	private String wrongAnswers;

	public Quiz() {
		
	}

	public Quiz(int id, String answer, String question, String wrongAnswers) {
		super();
		this.id = id;
		this.answer = answer;
		this.question = question;
		this.wrongAnswers = wrongAnswers;
	}

	public Quiz(String answer, String question, String wrongAnswers) {
		super();
		this.answer = answer;
		this.question = question;
		this.wrongAnswers = wrongAnswers;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getWrongAnswers() {
		return wrongAnswers;
	}

	public void setWrongAnswers(String wrongAnswers) {
		this.wrongAnswers = wrongAnswers;
	}

	@Override
	public String toString() {
		return "Quiz [id=" + id + ", answer=" + answer + ", question=" + question + ", wrongAnswers=" + wrongAnswers
				+ "]";
	}

	
	
}
