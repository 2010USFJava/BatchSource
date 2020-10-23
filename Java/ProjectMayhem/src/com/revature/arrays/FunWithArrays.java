package com.revature.arrays;

import java.util.Arrays;

public class FunWithArrays {
// group of like-typed variables that are referred to by a common name
	public static void main(String[] args) {
		//int array w/ 7 "buckets"
		int myArray[]= new int[7];
		
		//int array with hardcoded values
		int [] chaos= {56,87,333,8,0,4,5,6,475,4,6541,645351,2};
		//arrays start at index 0
		Arrays.sort(chaos);
		System.out.println(Arrays.toString(chaos));
		
	}

}
