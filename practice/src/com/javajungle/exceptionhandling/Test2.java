package com.javajungle.exceptionhandling;
//called program 

public class Test2 {
	
	//called function
	public void division() throws ArithmeticException
	{
		int z = 100/0;//ArithmeticException
		System.out.println(z);
	}

}
