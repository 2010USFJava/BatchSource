package com.revature.generics;

/*Generics
 * using a type as parameter
 * write code that can handle diff types of objects
 * use angle brackets <> to denote that something is a generic
 * Allows us to ensure type safety
 * adds stability and reusability to our code
 * Placeholder(T,E,?,etc.)- use instead of an explicit type
 */

public class Gen1<T> {
	//declare an object of type T
	T object;
	
	//pass the constructor a reference to an object of type T
	Gen1(T objectParameter){
		object=objectParameter;
	}
	
	//return object
	T getObject() {
		return object;
	}
	
	//Show the type of T
	void showType() {
		System.out.println("Type of T is: "+ object.getClass().getName());
	}
}
