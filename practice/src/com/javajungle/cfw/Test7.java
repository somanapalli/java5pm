package com.javajungle.cfw;

import java.util.HashSet;
import java.util.Set;

public class Test7 {
	
	public static void main(String[] args) {
		
		Set<Student> s = new HashSet<>();
		
		Student jag = new Student(100,"jag");
		Student suma = new Student(789,"suma");
		Student rk =   new Student(989,"rk");
		Student rk1 = new Student(989,"rk");
		
		s.add(jag);
		s.add(suma);
		s.add(rk);
		s.add(rk1);
		
		for(Student st:s)
		{
			System.out.println(st.getStid() +  " " + st.getStname());
		}
		
	}

}
