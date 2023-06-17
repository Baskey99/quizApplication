package com.springboot.quizApp.utill;

public class IncorrectAnswer {
	private String first;
	private String second;
	private String third;
	public IncorrectAnswer() {	}
	public IncorrectAnswer(String first, String second, String third) {
		super();
		this.first = first;
		this.second = second;
		this.third = third;
	}
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getSecond() {
		return second;
	}
	public void setSecond(String second) {
		this.second = second;
	}
	public String getThird() {
		return third;
	}
	public void setThird(String third) {
		this.third = third;
	}
	
}
