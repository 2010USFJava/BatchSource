package com.revature.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @AllArgsConstructor @NoArgsConstructor @ToString(exclude = {"trainer"})
public class Pokemon {

	@PositiveOrZero
	private int id;
	
	@Size(min = 1, max = 30)
	@NotNull
	private String name;
	private Type type;
	
	@JsonBackReference
	private Trainer trainer;
}
