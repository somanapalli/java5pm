package com.javajungle.cfw;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test11 {
	public static void main(String[] args) {
		
		Map<Integer,String> m = new LinkedHashMap<>();
		m.put(100, "rk");
		m.put(34, "suma");
		m.put(67, "jag");
		
		
		Set<Entry<Integer,String>> s = m.entrySet();
		
		for(Map.Entry<Integer, String> me:s)
		{
			System.out.println(me.getKey() + " " + me.getValue());
		}
	}

}
