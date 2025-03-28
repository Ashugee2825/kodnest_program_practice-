package com.map;

import java.util.IdentityHashMap;

public class WeakHashMap {
private static Object key1;

public static void main(String[] args) {
		
		Integer k1 = new Integer(100);
		Integer k2 = new Integer(200);
		Integer k3 = new Integer(300);
		
		Student s1 = new Stdent(1,"Sri");
		Student s2 = new Stdent(2,"Sai");
		Student s3 = new Stdent(3,"Sri Ashutosh"); 
		WeakHashMap whm = new WeakHashMap();
		whm.put(k1,s1);
		whm.put(k2,s2);
		whm.put(k3,s3);
		System.out.println("whm--->  "+whm);
		k1 = null;
		s1 = null;
		System.gc();
		for(int i =0; i<=100; i++) {
			System.out.println("");
		}
		System.out.println();
		System.out.println("=====================");
		System.out.println("whm -->" +whm);
		
		System.out.println("=================");
		String key2 = new String("Ramu");
		
		
		IdentityHashMap hm = new IdentityHashMap<>();
		hm.put(key1, 100);
		hm.put(key2, 200);
		
		System.out.println(hm);
}

private void put(Integer k1, Student s1) {
	// TODO Auto-generated method stub
	
}
}
