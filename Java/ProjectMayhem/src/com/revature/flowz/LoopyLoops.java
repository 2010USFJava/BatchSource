package com.revature.flowz;

public class LoopyLoops {
	/* If statement
	 * For decision making
	 * provides multiple paths of execution
	 * 
	 * if(<conditional>){
	 * <what to do if true>
	 * }else if(<second conditional){
	 * <what to do if 2nd conditional is true>
	 * else{
	 * <what to do if false>
	 * }
	 * 
	 * Switch Cases
	 * provides multiple paths of execution based on some value
	 * the "switch"  is based on an integer numeric, a string
	 * a char, a boolean, or enum.
	 * 
	 * For Loops
	 * for(a;b;c;){do something}
	 * a is variable declaration (counter) 
	 * b is the condition that controls how far the loop will go
	 * c is the incrementor/decrementor
	 */
	public static void main(String[] args) {
		//ifMethod(3,8);
		//whatColor("bluehfgjhfnm");
		//forLoopFunness(10);
		// int[] myArray= {12,15,46,87,92,0,0,5,78};
		//forEachFun(myArray);
		doWileyWhile(564);
	}
	
	public static void ifMethod(int a,int b){// a and b are method scope
		if(a>b) {
			int c=0;//block scope
			c=a+b;
			System.out.println("This is true!");
		}else if(a==6) {
			int c=3+9+b;
			System.out.println("Roll Tide");
		}else if(b==8){
			System.out.println("Go Team!");
		}
		else {
			System.out.println("This is false!!");
		}
		
	}
	
	public static void whatColor(String color) {
		switch(color) {
			case "green":
				System.out.println("you picked green!");
				break;
			default:
				System.out.println("You are dumb.");
				break;
			case "red":
				System.out.println("you chose red!");
				break;
			case "blue":
				System.out.println("you chose blue!");
				break;	
			case "purple":
				System.out.println("you chose purple!");
				break;
			
		}
	}
	 public static void forLoopFunness(int p) {
		 for(int i=0;i<p;i++) {
			 if(i==6) {
				 int d=9;
				 break;
				 //continue;
			 }
			 System.out.println("counter is at: "+i);
			 
			 
		 }
		 System.out.println("outside for loop");
		 
		 
	 }
		/*Enhanced for loop aka for each
		 * for (x:<Array or Collection>){do thing}
		 * good for moving through collections, arrays and other iterables
		 * more CPU efficient
		 * no issues w/ index out of bounds- not size dependent
		 * good for access elements in one collection
		 * bad for adding and removing*/
	 public static void forEachFun(int [] a) {
			
			  for(int i:a) {
				  System.out.println(i+5); }
			 
			/*
			 * for(int i=0;i<a.length;i++) { System.out.println(a[i]+5); }
			 */
		 
	 }
		/*While loops
		 * while(<condition>){<do something>}
		 * 
		 * do while
		 * do {<do thing>} while (<condition>)
		 * */
	public static void wileyWhile(int i) {
		while(i++<10) {
			System.out.println("Roll Tide in the while loop");
			//i++;
		}
	}
	
	public static void doWileyWhile(int i) {
		do {
			System.out.println("do you feel like we do " +i);
			i++;
		} while(i<=10);
		//i++;
	}
}
