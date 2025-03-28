package CollectionFramework;

import java.util.ArrayList;

public class Demo1 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		al.add(600);
		al.add(700);
		System.out.println(al);
		al.add(800);
		System.out.println(al);
		System.out.println("================MAke ArrayList read only=======");
		
	}

}
