package com.javajungle.cfw;

import java.util.ArrayList;

public class Test5 {
	public static void main(String[] args) {
		
		//generics 
		ArrayList<Student> al = new ArrayList<>();
		
		Student student1 = new Student(100,"jagadeesh");
		Student student2 = new Student(101,"suma");
		
	    al.add(student1);
		al.add(student2);
		
		System.out.println(al);
		
	}

}
