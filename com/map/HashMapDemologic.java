package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemologic {
	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		hm.put(100, "Ashutosh");
		hm.put(50, "Kumar");
		hm.put(150, "Ashu");
		hm.put(25, "tosh");
		hm.put(75, "AshuDon");
		hm.put(125, "AshuDon Keshri");	
		hm.put(175, "Ashutosh Kumar");
		System.out.println(hm);
		System.out.println("=====================================");
		
		Set s = hm.keySet();
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+ " ");
		}
		System.out.println();
		System.out.println("======================================");
		Collection c = hm.values();
		itr = c.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+ " ");
		}
		System.out.println();
		System.out.println("======================================");
		Set s1 = hm.entrySet();
		itr=s1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()+ " ");
		}
		
		
		}

}
