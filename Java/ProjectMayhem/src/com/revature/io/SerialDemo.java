package com.revature.io;

import com.revature.beans.Person;

public class SerialDemo {

	public static void main(String[] args) {
		IO io = new IO();
		String a="banana";
		/*if output.txt does not exist, it will create it!
		 * If it doesnt exist, run it, and then refresh the project
		 * explorer to see it
		 * 
		 */
		//io.writeOutputStreamContents("Actuallly, Lady Gaga is a "+ a);
		//System.out.println(io.readInputStreamContents());
		
//		Person p1= new Person("Matt", 34,275);
//		Person p2= new Person("Chris",21, 175);
//		Person p3= new Person("Siera", 5, -0);
//		Person p4= new Person("The Huntress", 28, 160);
//		
//		IOWithCollections.personList.add(p1);
//		IOWithCollections.personList.add(p2);
//		IOWithCollections.personList.add(p3);
//		IOWithCollections.personList.add(p4);
//		
//		IOWithCollections.writePersonFile();
		IOWithCollections.readPersonFile();
		System.out.println(IOWithCollections.personList.toString());
	
	}

}
