package com.revature.compare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareMain {

	public static void main(String[] args) {
		List<Student> studentList= new ArrayList<Student>();
		studentList.addAll(Arrays.asList(
				new Student[] {
						new Student(9,"Matt",7.22),
						new Student(18,"Heermancer",3.98),
						new Student(27,"Esrat",50.99),
						new Student(3,"Mike",0.9),
						new Student(2,"Nadjah",2.5),
						new Student(151,"Anna",4.02),
						new Student(70,"Isa",4.01),
						new Student(5000000,"Jennifer the Hunter",20.20)						
				}));
		System.out.println("Original List");
		for(Student s:studentList) {
			System.out.println(s);
		}
		
		System.out.println("================");
		Collections.sort(studentList);
		System.out.println("Sorted by StudentID");
		for(Student s:studentList) {
			System.out.println(s);
		}
		System.out.println("================");
		Collections.sort(studentList,new StudentComparator());
		System.out.println("Sorted by GPA");
		for(Student s:studentList) {
			System.out.println(s);
		}
		System.out.println("================");
		System.out.println("Sorted by Label  using Lambda");
		Collections.sort(studentList,(arg0,arg1)
				->{
					return arg0.getLabel().compareTo(arg1.getLabel());
				});
		for(Student s:studentList) {
			System.out.println(s);
		}
	}

}
