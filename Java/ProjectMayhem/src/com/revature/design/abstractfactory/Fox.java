package com.revature.design.abstractfactory;

public class Fox implements Animal{

	@Override
	public String getAnimal() {
		
		return "Jeff FoxWorthy and Ylvis";
	}

	@Override
	public String makeSounds() {
	
		return "RINGDINGDINGADING";
	}

}
