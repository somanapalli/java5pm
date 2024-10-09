package com.javajungle.exceptionhandling;
//calling program
public class Test3 {
	//calling function
	public static void main(String[] args) {
		
		Test2 test2 = new Test2();
		try {
		test2.division();
		}
		catch(ArithmeticException ae)
		{
			System.out.println("something wrong in division method, check it once");
		}
	}

}
