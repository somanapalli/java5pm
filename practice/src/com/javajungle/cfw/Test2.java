package com.javajungle.cfw;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(100);
		al.add("ram");
		al.add(true);
		al.add(4.5);
		al.add(100);
		al.add(null);
		System.out.println(al.size());
		System.out.println(al.get(0));
		System.out.println(al.remove(0));
		System.out.println(al.size());
		System.out.println(al.remove(true));
		System.out.println(al.size());
		System.out.println(al.contains(4));
		System.out.println(al);
		al.add(0, 500);
		System.out.println(al);
		
	}
}
