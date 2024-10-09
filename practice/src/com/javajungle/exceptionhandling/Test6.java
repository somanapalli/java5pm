package com.javajungle.exceptionhandling;

import java.util.Scanner;

public class Test6 {
	
	public static void main(String[] args) {
		
		Test5 obj = new Test5();
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter product weight");
		int productWeight = scanner.nextInt();
		
		obj.checkProduct(productWeight);
	}

}
