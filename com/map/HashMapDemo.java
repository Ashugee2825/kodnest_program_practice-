package com.map;

import java.util.HashMap;
import java.util.LinkedHashMap;

import CompareComplexData.Student;

public class HashMapDemo {	
public static void main(String[] args) {
	HashMap<Object, Object> hs = new HashMap<>();
	hs.put(100, new Student(1,"Srinath", "Male",89,"Bengaluru",78945));
	hs.put(150, new Student(2,"Sharath", "Male",90,"Bengaluru lmt",5578945));
	hs.put(180, new Student(3,"Sri", "Male",91,"Benglaore",7878945));
	System.out.println(hs);
	
	System.out.println("==========================================");
	LinkedHashMap lhs = new LinkedHashMap<>();
	lhs.put(100, new Student(1,"Srinath", "Male",89,"Bengaluru",78945));
	lhs.put(150, new Student(2,"Sharath", "Male",90,"Bengaluru lmt",5578945));
	lhs.put(180, new Student(3,"Sri", "Male",91,"Benglaore",7878945));
	System.out.println(lhs);
		
	}
}
