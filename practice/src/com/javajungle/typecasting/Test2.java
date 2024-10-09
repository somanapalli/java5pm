package com.javajungle.typecasting;

public class Test2 {
	
	public static void main(String[] args) {
		
		//widening type casting or implicit type casting
		int num = 100;
		double d = num;
		
		System.out.println("widening: " + d);
		
		//narrowing type casting
		
		double decimal = 9.78;
		int n = (int)decimal;
		System.out.println("narrowing:  " + n);
		
	}

}
