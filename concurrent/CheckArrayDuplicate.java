package concurrent;


import java.util.Iterator;

import com.remocesev.TreeSet;

public class CheckArrayDuplicate {

	public static void main(String[] args) {
		TreeSet ref = new TreeSet<>();
		ref.add(100);
		ref.add(50);
		ref.add(150);
		ref.add(25);
		ref.add(75);
		ref.add(125);
		ref.add(175);
		ref.add(null);
		Iterator itr = ref.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			ref.add(99);
		}
		System.out.println("====================================");
		
		System.out.println(ref);
		
	}

}
