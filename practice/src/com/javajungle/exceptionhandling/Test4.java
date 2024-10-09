package com.javajungle.exceptionhandling;

public class Test4 {

	public static void main(String[] args) {

		String s = "rama";
		if (s.startsWith("r")) {
			try {
				throw new ArithmeticException();
			} catch (ArithmeticException ae) {
				System.out.println("name shouldn't starts with r");
			}
		} else {
			System.out.println("name is valid");
		}
		System.out.println("rest statements");
	}

}
