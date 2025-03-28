package compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodCollection {

	public static void main(String[] args) {
		List al = new ArrayList();
			al.add(100);
			al.add(50);
			al.add(150);
			al.add(25);
			al.add(75);
			al.add(125);
			al.add(175);
			System.out.println(al);
			Collections.sort(al);
			System.out.println(al);
			System.out.println(Collections.binarySearch(al,25));
			System.out.println(Collections.frequency(al,100));
			System.out.println(Collections.max(al));
			System.out.println(Collections.min(al));
			List al2 = new ArrayList();
			List al1 = new ArrayList();

			al1.add(1000);
			al2.add(5000);
			System.out.println("al1--->" + al1);
			System.out.println("al2--->" + al2);
	
	}

}


