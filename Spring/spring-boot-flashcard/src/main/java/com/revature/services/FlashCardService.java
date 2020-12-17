package com.revature.services;

import java.util.List;
import java.util.Optional;

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
		return (List<FlashCard>) cardRepo.findAll();
	}
	
	@Transactional(readOnly=true, isolation=Isolation.READ_COMMITTED)
	public FlashCard getById(int id) {
		Optional<FlashCard> _card=cardRepo.findById(id);
		return _card.get();
	}
	
	@Transactional
	public FlashCard add(FlashCard newCard) {
		if(newCard.getQuestion().equals("")|| newCard.getAnswer().equals("")) return null;
		if(newCard.getQuestion()==null|| newCard.getAnswer()==null) return null;
		return cardRepo.save(newCard);
	}
	@Transactional
	public FlashCard update(FlashCard updatedCard ) {
		if(updatedCard.getQuestion().equals("")|| updatedCard.getAnswer().equals("")) return null;
		if(updatedCard.getQuestion()==null|| updatedCard.getAnswer()==null) return null;
		return cardRepo.save(updatedCard);
	}
	
	@Transactional
	public boolean delete(int id) {
		cardRepo.deleteById(id);
		FlashCard card=getById(id);
		if(card==null) return true;
		return false;
	}
}
