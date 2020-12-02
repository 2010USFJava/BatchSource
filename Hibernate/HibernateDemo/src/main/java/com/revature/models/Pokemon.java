package com.revature.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Pokemon {

	private int id;
	private String name;
	private Type type;
	private Trainer trainer;
}
