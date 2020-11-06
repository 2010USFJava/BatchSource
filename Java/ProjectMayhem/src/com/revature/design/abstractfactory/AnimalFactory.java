package com.revature.design.abstractfactory;

public class AnimalFactory implements AbstractFactory<Animal>{

	@Override
	public Animal create(String t) {
		if (t.equalsIgnoreCase("Quokka")) {
            return new Quokka();
        } else if (t.equalsIgnoreCase("Duck")) {
            return new Duck();
        }else if (t.equalsIgnoreCase("Fox")) {
            return new Fox();	
        }
        return null;
    }
	}


