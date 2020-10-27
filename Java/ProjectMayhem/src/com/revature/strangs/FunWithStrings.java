package com.revature.strangs;

public class FunWithStrings {
	/*Strings!
	 * not char or Character
	 * Fully Qualified class name:java.lang.String
	 * String literal is 0+ characters ex "" or String a="Roll Tide";
	 * concatenate strings w/ + .concat()
	 * "goodbye" + " earth"
	 * Strings are immutable
	 * String pool- collection of unique String literals in heap memory
	 * some strings are common and used in mult places within app
	 * String s= "dog"; Compiler searches string pool for "dog"
	 * if it exists, it will create a reference to it, 
	 * if it does not exist, it will create a new string literal in the string pool
	 * String a= "dog"; same reference as s
	 * a=a+"house";
	 * String API has utility methods!
	 * 
	 * String- String Pool, Immutable, thread safe, fast
	 * StringBuilder- No String pool, Mutable,not thread safe,fast
	 * StringBuffer- No String pool, Mutable,thread safe,slow
	 */
	public static void main(String[] args) {
		String s= "dog";
		String a="dog";
		System.out.println(s.hashCode());
		System.out.println(a.hashCode());
		a=a+"house";
		System.out.println(a.hashCode());
		System.out.println(s.charAt(2));
		StringBuilder sb= new StringBuilder("Roll Tide");
		StringBuilder sb2=new StringBuilder("Roll Tide");
		System.out.println(sb.hashCode());
		//System.out.println(sb2.hashCode());
		sb= sb.append("w");
		System.out.println(sb.hashCode());
	}

}
