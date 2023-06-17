package com.springboot.quizApp.entity;

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
	
	@Column(name="correct_answer")
	private String correct_answer;
	
	@Column(name="question")
	private String question;
	
	@Column(name="incorrect_answers")
	private List<String> incorrect_answers;

	public Quiz() {
		
	}

	public Quiz(int id, String correct_answer, String question, List<String> incorrect_answers) {
		super();
		this.id = id;
		this.correct_answer = correct_answer;
		this.question = question;
		this.incorrect_answers = incorrect_answers;
	}

	public Quiz(String correct_answer, String question, List<String> incorrect_answers) {
		super();
		this.correct_answer = correct_answer;
		this.question = question;
		this.incorrect_answers = incorrect_answers;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCorrect_answer() {
		return correct_answer;
	}

	public void setCorrect_answer(String correct_answer) {
		this.correct_answer = correct_answer;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<String> getIncorrect_answers() {
		return incorrect_answers;
	}

	public void setIncorrect_answers(List<String> incorrect_answers) {
		this.incorrect_answers = incorrect_answers;
	}

	@Override
	public String toString() {
		return "Quiz [id=" + id + ", correct_answer=" + correct_answer + ", question=" + question
				+ ", incorrect_answers=" + incorrect_answers + "]";
	}
	

}
