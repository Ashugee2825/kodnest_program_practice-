package com.kodnest.queue.queuebasedimpl;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
		ArrayDeque ad = new ArrayDeque();		
		ad.add(100);
		ad.add(50);
		ad.add(150);
		System.out.println(ad);
		ad.addFirst(25);
		ad.addFirst(99);
		System.out.println("=============================");
		System.out.println(ad.remove());
		System.out.println(ad);
		System.out.println(ad.removeLast());
		System.out.println(ad);
		System.out.println(ad.removeFirst());
		System.out.println(ad);
		ArrayDeque ad2 = new ArrayDeque();
		ad2.add(100);
		ad2.add(50);
		ad2.add(150);
		ad2.add(25);
		ad2.add(75);
		ad2.add(125);
		ad2.add(175);
		System.out.println("ad--> "+ad);
		ad2.retainAll(ad);
		System.out.println("ad2-->"+ad);
		
		
	}

}
