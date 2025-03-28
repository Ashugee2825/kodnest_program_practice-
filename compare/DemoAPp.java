package compare;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import CompareComplexData.Student;

public class DemoAPp {
	public static void main(String[] args) {
		Student s1 =new Student(125,"Sarlar",95);
		Student s2 =new Student(145,"Sahasra",86);
		Student s3 =new Student(111,"Shambhavi",99);
		Student s4 =new Student(90,"Anjali",56);
		List ref = new ArrayList();
		ref.add(s1);
		ref.add(s2);
		ref.add(s3);
		ref.add(s4);
		System.out.println(ref);
		Comparator cc = new Comparator() {
			

			@Override
			public int compare(Object o1, Object o2) {
				Student ref1 = (Student)o1;
				Student ref2 = (Student)o2;
				if(ref1.id>ref2.id)
					return 1;
				else
					return -1;
				return 0;
			}
			
		}	
			
			
	}
}
