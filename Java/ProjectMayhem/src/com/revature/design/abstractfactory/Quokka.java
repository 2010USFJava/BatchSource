package com.revature.design.abstractfactory;

public class Quokka implements Animal{

	@Override
	public String getAnimal() {
		return "Quokka?";
	}

	@Override
	public String makeSounds() {

		return "SQUEKS";
	}

}
