package com.javajungle.cfw;

import java.util.ArrayList;

public class Test3 {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		for(int i=1;i<=10;i++)
		{
			al.add(i);
		}
		
		al.add("ram");//runtime errors
		for(Object i:al )
		{
			//type casting 
			Integer x = (Integer)i;
			
			if(x%2==0)
			{
				System.out.println(i);
			}
			
		}
	}

}
