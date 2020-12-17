package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.revature.models.FlashCard;
import com.revature.repos.FlashCardRepository;

@Service
public class FlashCardService {
	private FlashCardRepository cardRepo;
	
	@Autowired
	public FlashCardService(FlashCardRepository flashCardRepo) {
		this.cardRepo=flashCardRepo;
	}
	
	@Transactional(readOnly=true, isolation=Isolation.READ_COMMITTED)
	public List<FlashCard> getAll(){
		return cardRepo.getAll();
	}
	
	@Transactional(readOnly=true, isolation=Isolation.READ_COMMITTED)
	public FlashCard getById(int id) {
		return cardRepo.getById(id);
	}
	
	@Transactional
	public FlashCard add(FlashCard newCard) {
		if(newCard.getQuestion().equals("")|| newCard.getAnswer().equals("")) return null;
		if(newCard.getQuestion()==null|| newCard.getAnswer()==null) return null;
		return cardRepo.add(newCard);
	}
	@Transactional
	public FlashCard update(FlashCard updatedCard ) {
		if(updatedCard.getQuestion().equals("")|| updatedCard.getAnswer().equals("")) return null;
		if(updatedCard.getQuestion()==null|| updatedCard.getAnswer()==null) return null;
		return cardRepo.update(updatedCard);
	}
	
	@Transactional
	public boolean delete(int id) {
		return cardRepo.delete(id);
	}
}
