package com.revature.design.abstractfactory;

public class Duck implements Animal{

	@Override
	public String getAnimal() {
		
		return "Duck";
	}

	@Override
	public String makeSounds() {
		return "Quack";
	}

}
