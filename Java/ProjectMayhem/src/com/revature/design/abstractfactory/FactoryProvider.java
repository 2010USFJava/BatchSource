package com.revature.design.abstractfactory;

public class FactoryProvider {
	public static AbstractFactory<?> getFactory(String choice) {
		if(choice.equalsIgnoreCase("Animal")) {
			return new AnimalFactory();
		}else if (choice.equalsIgnoreCase("Color")) {
			return new ColorFactory();
		}
		return null;
	}
}
