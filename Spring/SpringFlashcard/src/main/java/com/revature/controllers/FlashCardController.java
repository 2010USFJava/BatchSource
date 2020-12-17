package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.FlashCard;
import com.revature.services.FlashCardService;

@RestController
@RequestMapping("/flash-cards")
public class FlashCardController {
	private FlashCardService cardService;
	
	
	@Autowired
	public FlashCardController(FlashCardService flashCardService) {
		this.cardService=flashCardService;
	}
	
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public String getAllCards(){
		return "Work?";
	}
//	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
//	public List<FlashCard> getAllCards(){
//		return this.cardService.getAll();
//	}
	
	@GetMapping(value="/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public FlashCard getCardById(@PathVariable int id) {
		FlashCard card=cardService.getById(id);
		return card;
	}
//	@PostMapping(consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<FlashCard> addCard(@RequestBody FlashCard newCard){
//		System.out.println(newCard);
//		FlashCard addedCard= cardService.add(newCard);
//		return new ResponseEntity<>(addedCard,HttpStatus.CREATED);
//	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping(consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public FlashCard addCard(@RequestBody FlashCard newCard){
		System.out.println(newCard);
		FlashCard addedCard= cardService.add(newCard);
		return addedCard;
	}

}
