package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayAndLinked_List {
	public class Demo{
		public static void main(String[] arg, ArrayList a1) {
			ArrayList al = new ArrayList();
			a1.add(1000);
			a1.add(150);
			al.add("Ramu");
			al.add("Somu");
			al.add(3.147f);
			al.add(true);
			System.out.println("al");
			System.out.println("================================");
			
			for(int i=0; i<=al.size()-1; i++) {
				System.out.print(al.get(i)+"");
			}
			
			System.out.println();
			System.out.println("================================");
			Iterator itr = al.iterator();
			while(itr.hasNext()==true) {
				System.out.print(itr.next()+" ");
			}
			
			System.out.println();
			System.out.println("==================================");
			for (object x : a1) {
				System.out.println(x+" ");
			}
			
			System.out.println();
			System.out.println("==================================");
			
			
			LinkedList ll = new LinkedList();
			ll.add(100);
			ll.add(50);
			ll.add(150);
			ll.add(25);
			ll.add(75);
			ll.add(125);
			System.out.println("");
			
			
		}
	}

}
