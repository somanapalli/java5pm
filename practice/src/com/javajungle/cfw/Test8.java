package com.javajungle.cfw;

import java.util.SortedSet;
import java.util.TreeSet;

public class Test8 {

	public static void main(String[] args) {
		
		SortedSet<Integer> s = new TreeSet<>();
		
		s.add(34);
		s.add(9);
		s.add(897);
		s.add(5);
		s.add(89);
		s.add(53);
		s.add(123);
		
		System.out.println(s.first());
		System.out.println(s.last());
		System.out.println(s.headSet(53));
		System.out.println(s.tailSet(89));//[89,123,897]
		System.out.println(s.subSet(34, 897));//[34,53,89,123]
		
		
		
		
		
		
	}
}
