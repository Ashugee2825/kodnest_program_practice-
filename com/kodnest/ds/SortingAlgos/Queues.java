package com.kodnest.ds.SortingAlgos;

public class Queues {
	private int r = -1;
	private int f =-1;
	private int size =0;
	int q[]=null;
	public Queues(int size) {
		this.size = size;
		q=new int[size];
		System.out.println("Q of Size "+size+" created");
		
	}
	public void insert(int elem) {
		if(r==size-1) {
			System.out.println("Insertion Not Possible asQ is full");
		}
		else {
			++r;
			q[r]=elem;
			System.out.println("Element  "+elem+" Inserted into the queue");
		}
	}
		public void delete() {
			if(r==1 || f==size-1) {
				System.out.println("Queue is Empty element cannot delete");
				
			}else {
				++f;
				System.out.println("Element deleted is "+q[f]);
				q[f] =0;
				
			}
		}
		public void display() {
			if(r==-1 || f==-1) {
				System.out.println("Queue Is Empty there is nothing to display");
			}
			else {
				for(int i=0; i<=r; i++) {
					System.out.println(q[i]+"");
				}
				System.out.println("");
			}
	}
 

}
