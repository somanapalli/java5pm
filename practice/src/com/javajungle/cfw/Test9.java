package com.javajungle.cfw;

import java.util.SortedSet;
import java.util.TreeSet;

public class Test9 {
	
	public static void main(String[] args) {
		
		SortedSet<Student> s = new TreeSet<>(new StudentNameComparator());
		
		Student charvi = new Student(10,"charviha");
		Student ankit = new Student(7,"ankit");
		Student leshvi = new Student(89,"leshviha");
		
		s.add(charvi);
		s.add(ankit);
		s.add(leshvi);
		
		System.out.println(s);
		
		
	}

}
