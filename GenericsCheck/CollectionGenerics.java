package Generics;

import java.util.ArrayList;

public class CollectionGenerics {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add(100);
	al.add("Ramu");
	al.add("10000");
	System.out.println(al);
	
	ArrayList<Integer> al2 = new ArrayList();
	al2.add(50);
	al2.add(25);
	System.out.println(al2);
} 


}
