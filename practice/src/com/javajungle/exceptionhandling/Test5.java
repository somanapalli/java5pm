package com.javajungle.exceptionhandling;

public class Test5 {
	
	
   public void checkProduct(int weight)
   {
	   if(weight>100)
	   {
		   System.out.println("product is valid");
	   }
	   else
	   {
		   try {
		   throw new InvalidProductException();
		   }
		   catch(InvalidProductException ipe)
		   {
			   System.out.println("check the product weight, must be greter than 100kgs");
		   }
	   }
	   System.out.println("rest statements executed");
   }
}
