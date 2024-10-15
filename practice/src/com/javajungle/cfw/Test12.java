package com.javajungle.cfw;

import java.util.SortedMap;
import java.util.TreeMap;

public class Test12 {
	
	public static void main(String[] args) {
		
		SortedMap<Employee,String> sm = new TreeMap<>(new EmployeeIdComparator());
	    
	    sm.put(new Employee(100,"rk"), "wipro");
	    sm.put(new Employee(567,"suma"), "infosys");
	    sm.put(new Employee(54,"jag"), "facebook");
	    
	    
	    System.out.println(sm);
	
	}

}
