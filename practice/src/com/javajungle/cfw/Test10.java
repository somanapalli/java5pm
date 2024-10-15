package com.javajungle.cfw;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test10 {
	
	public static void main(String[] args) {
		
		//Create an object for Map interface
		
		Map m = new HashMap();
		m.put(100, "Rk");
		//m.put("jag", 200);
		m.put(100, "ram");
		m.put(200, "suma");
		m.put(300, "jag");
		
		//m.put(null, null);
		
//		System.out.println(m.size());
//		System.out.println(m.containsKey(2000));
//		System.out.println(m.containsValue("javajungle"));
//		System.out.println(m.remove("jag"));
//		System.out.println(m.size());
//		System.out.println(m.get(100));
//		m.replace(null, null, "suma");
//		System.out.println(m);
		
		Set s = m.entrySet();
		
		Object o[] = s.toArray();
		
		for(int i=0;i<o.length;i++)
		{
			
			System.out.println(o[i]);
		}
		
		System.out.println("using foreach loop");
		
		for(Object obj:s)
		{
			System.out.println(obj);
		}
	}

}
