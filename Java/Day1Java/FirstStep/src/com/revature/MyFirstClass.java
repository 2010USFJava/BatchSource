//Single line comment
/*
 * Multi
 * line
 * comment
 * for 
 * long
 * messages
 */

//packages- namespace or folder style directory
package com.revature;// naming convention something.somethingelse....


public class MyFirstClass {// naming convention for classes and projects- cap each word, Pascal Case
	
	static final double THIS_IS_PI=3.14;//naming convention for constant ALL CAPS delimited by underscores
	public static void main(String [] args) {// naming convention for method and variables- camelCase ex. mainMethod()
		
		/*Main Method- entry point of application "driver" class has the main method.
		 * public - access modifier- any class can see it
		 * static - belongs to class, dont have to instantiate an object to use
		 * void - doesn't return anything
		 * main - name of the method
		 * String [] args - method parameter, array of Strings, args?- name of the variable
		 */
		System.out.println("Hey, i did a thing!");
		System.out.println("Roll Tide");
	}
}
