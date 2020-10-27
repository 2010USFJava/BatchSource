package com.revature.constructor;

public class ConstructorDemo {

	public static void main(String[] args) {
		C c= new C();

	}

}


class B extends A{
	B(){
		
		System.out.println("Inside B's constructor");
	}
}

class C extends B{
	C(){
		//super();
		System.out.println("Inside C's constructor");
	}
}

class A{
	A(){
		//super(); ----
		System.out.println("inside A's Constructor");
	}
}
