package com.kodnest.ds.SortingAlgos;

public class stacks {

	private int s[]=null;
	private int size=0;
	private int top=-1;
	
	public stacks(int size) {
		this.size=size;
		s = new int[size];
		System.out.println("");
	}
	
public void push(int elem) {
	if(top==size-1) {
		System.out.println("");
		
	}
	else {
		++top;
		s[top]=elem;
		System.out.println("");
	}
	public void pop() {
		if(top==-1) {
			System.out.println();
		}
	}
}
	
}
