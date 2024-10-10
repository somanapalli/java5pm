package com.javajungle.cfw;

import java.util.LinkedHashSet;
import java.util.Set;

public class Test6 {

	public static void main(String[] args) {
		
		//create the object for HashSet
		
		Set s = new LinkedHashSet();
		s.add(45);
		s.add("rama");
		s.add(8.9);
		s.add(45);
		s.add(null);
		
		
		
		System.out.println(s);
		
	}
}
