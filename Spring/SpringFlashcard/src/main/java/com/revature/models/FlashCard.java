package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="flash_cards")
@SequenceGenerator(name="card_gen",sequenceName="card_seq", allocationSize=1)
public class FlashCard {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="card_gen")
	private int id;
	@Column(name="question", nullable=false)
	private String question;
	@Column(name="answer", nullable=false)
	private String answer;
	
	

	public FlashCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FlashCard(int id, String question, String answer) {
		super();
		this.id = id;
		this.question = question;
		this.answer = answer;
	}
	public FlashCard(String question, String answer) {
		super();
		this.question = question;
		this.answer = answer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "FlashCard [id=" + id + ", question=" + question + ", answer=" + answer + "]";
	}
	
	
}
