package CollectionFramework;



import java.util.HashSet;

public class Demo {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(8);
		hs.add(0);
		hs.add(9);
		hs.add(5);
		hs.add(0);
		hs.add(0);
		hs.add(0);
		hs.add(1);
		hs.add(2);
		hs.add(3);
		System.out.println(hs);
		Object[] arr = hs.toArray();
		int array[] = new int[arr.length];
		for(int i =0; i <=arr.length-1; i++) {
			Integer j =(Integer) arr[i];
			//Unboxing
			array[i]= j.intValue();
			
		}
		System.out.println("=============================");
		for (int i : array) {
			System.out.println(i +" ");
		}
	}

}
