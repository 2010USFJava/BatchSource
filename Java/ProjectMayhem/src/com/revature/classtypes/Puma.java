package com.revature.classtypes;

public class Puma extends Mammal{
	private boolean isCapabaleOfMurderingPeople;
	
	@Override
	public void breathe() {
		System.out.println("I breathe thru ma nose...roar");
		
	}

	public Puma() {
		super();
		
	}

	public Puma(boolean isCapabaleOfMurderingPeople) {
		super();
		this.isCapabaleOfMurderingPeople = isCapabaleOfMurderingPeople;
	}

	@Override
	public void findPrey() {
		System.out.println("I stalk things in the forest");
		
	}

	@Override
	public String toString() {
		return "Puma [isCapabaleOfMurderingPeople=" + isCapabaleOfMurderingPeople + "]";
	}
	

}
