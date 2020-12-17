package com.revature.repos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.revature.models.FlashCard;

@Repository
public class FlashCardRepository implements CrudRepository<FlashCard>{

	private SessionFactory factory;
	
	@Autowired
	 public FlashCardRepository(SessionFactory sessionFactory) {
		this.factory= sessionFactory;
	}
	
	@Override
	public List<FlashCard> getAll() {
		return factory.getCurrentSession().createQuery("from FlashCard", FlashCard.class).getResultList();
	}

	@Override
	public FlashCard getById(int id) {
		return factory.getCurrentSession().get(FlashCard.class, id);
	}

	@Override
	public FlashCard add(FlashCard newCard) {
		factory.getCurrentSession().save(newCard);
		return newCard;
	}

	@Override
	public FlashCard update(FlashCard updatedCard) {
		Session session =factory.getCurrentSession();
		FlashCard card= session.get(FlashCard.class,updatedCard.getId());
		if(card==null) return null;
		card.setQuestion(updatedCard.getQuestion());
		card.setAnswer(updatedCard.getAnswer());		
		return card;
	}

	@Override
	public boolean delete(int id) {
		Session session =factory.getCurrentSession();
		FlashCard card= session.get(FlashCard.class,id);
		if(card==null) return false;
		session.delete(card);
		return true;
	}
	
}
