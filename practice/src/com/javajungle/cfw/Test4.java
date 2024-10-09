package com.javajungle.cfw;

import java.util.ArrayList;

public class Test4 {
	public static void main(String[] args) {
		
		//generics 
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=1;i<=10;i++)
		{
			al.add(i);
		}
		
		//al.add("ram");//compiletime errors
		for(Integer i:al )
		{
			
			if(i%2==0)
			{
				System.out.println(i);
			}
			
		}
	}

}
