package com.revature.beans;
/*Java is an object oriented language
objects have states and behavior
Class- template for an object
make instances by utilizing classes' constructors
Pillars of OOP
-Polymorphism
	-many forms
	-method overriding and overloading
		-overriding - same name and params, diff behavior (between 2 classes)
		-overloading -same name, but diff params (same class)	
	-Multiple "is-a" relationships
	-Covariance
-Encapsulation
	-wrapping and protecting data fields, preventing outside manipulation
	-concealing the internal state of the object
-Inheritance
	-programming language allows for hierarchy of objects
	- multiple inheritance??- NO! but kinda w/ interfaces
		-Diamond problem 
	
-Abstraction
	-hiding implementation details, exposing only functionality
	-"what it does, not how it does it"
	
*/
public class Person {
	/*bean- represents some entity
	More for data structure 
	Makeup:
		private fields
		no args constructor
		constructor w/ fields
		getters and setters
		override toString(), equals(), hashcode()
		
	*/
	
	/*Members of a class
	 * Instance variables- property of a specific object
	 * Static variables- property that belongs to the class aka to every object of that type
	 * Instance methods- behavior related to a specific object
	 * Static methods- behavior related to the entire class 
	 * Constructor- instantiates the class using the "new" keyword
	 */
	private String name;
	private int age;
	private int weight;
	static String homePlanet="earth";
	
	public static String getHomePlanet() {
		return homePlanet;
	}

	public static void setHomePlanet(String homePlanet) {
		Person.homePlanet = homePlanet;
	}

	//no args constructor
	 public Person (){
		//super();
	}
	
	 //constructor with fields
	 public Person(String name,int age,int weight) {
		 this.name=name;
		 this.age=age;
		 this.weight=weight;
	 }
	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", weight=" + weight +
				", homePlanet= "+homePlanet+"]";
	}

	
	
	 
	 
	 
	 
	 
}
