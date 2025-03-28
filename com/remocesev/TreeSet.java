package com.remocesev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TreeSet {
public static void main(String[] args) {
	List ref = new ArrayList();
	ref.add(86);
	ref.add(42);
	ref.add(23);
	ref.add(18);
	ref.add(25);
	
	System.out.println(ref);
	// Approach -1
	TreeSet ts = new TreeSet();
	ts.add(ref);
	System.out.println("TreeSet---> " +ts);
	//Approach --2
	Collections.sort(ref);
	System.out.println("ArrayList-->"   +ref );
	
	
	
	
	
	
	
	
	
}

public void add(List ref) {
	// TODO Auto-generated method stub
	
}
}
