package com.revature.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.revature.models.FlashCard;

@Repository
public interface FlashCardRepository extends CrudRepository<FlashCard,Integer>{

}
