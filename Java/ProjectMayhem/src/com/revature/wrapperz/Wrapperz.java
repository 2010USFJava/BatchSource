package com.revature.wrapperz;

public class Wrapperz {
	/*
	 * All Wrapper Classes inherit from the Number class
	 * Have utility methods, constants!
	Character - char
	Boolean - boolean
	Byte - byte
	Short - short
	Integer -int
	Long -long
	Float -float
	Double - double
	
	Auto-Boxing - Expensive process!!
	-Boxing- implicit conversion from primitive to wrapper class
	-Unboxing- implicit conversion from wrapper to primitive
	
	*/
	static int myInt=3;
	static Integer myInteger=5;
	static Double myDouble=45.93;
	
	public static int addEmUp(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
	int result= addEmUp(myInt,myDouble.intValue());
	System.out.println(result);
	Integer i=0;
	i= i.MAX_VALUE;
	System.out.println(i);
	}

}
