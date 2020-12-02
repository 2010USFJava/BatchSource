package com.revature;

import com.revature.models.Pokemon;
import com.revature.models.Type;

public class Driver {

	public static void main(String[] args) {
		Pokemon p = new Pokemon(1, "Bulbasaur", Type.Grass, null);
		
		System.out.println(p.getName());

	}

}
