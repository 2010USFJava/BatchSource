package com.revature.fib;

public class FibonacciSolver {

	public static void main(String[] args) {
		/*Common whiteboarding question- Fibonacci Sequence
	 * 	The Fibonacci numbers are a sequence of integers in
		which the first two elements are 0 & 1, and each following
		elements are the sum of the two preceding elements:
		 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
		 * 
		 * 
		 * What is recursion?
		 * using subprocesses to complete processes
		 * Recursive solutions, by definition, are built off of solutions to subproblems.
		 */
		System.out.println(fibonacciRecursion(5));
		
	}

	public static int fibonacciIteration(int nthNumber) {
		//use iterations ->loop
		int previousNumber=0;
		int previouspreviousNumber=0;
		int currentNumber=1;
		
		for(int i=1;i<nthNumber;i++) {
			System.out.println("================================");
			System.out.println("currentNumber is "+currentNumber);
			System.out.println("previousNumber is "+previousNumber);
			System.out.println("previouspreviousNumber is "+ previouspreviousNumber);
			previouspreviousNumber=previousNumber;
			previousNumber=currentNumber;
			currentNumber= previouspreviousNumber +previousNumber;
			
		}
		return currentNumber;
	}
	
	public static int fibonacciRecursion(int nthNumber) {
		//use recursion
		if (nthNumber==0) {
			System.out.println(nthNumber);
			return 0;
		}else if (nthNumber==1) {
			System.out.println(nthNumber);
			return 1;
		}
		System.out.println(nthNumber);
		return fibonacciRecursion(nthNumber-1)+ fibonacciRecursion(nthNumber-2);
	}
}

/*
 * factorial 4== 4*3*2*1
 * 5*4*3*2*1
 */

