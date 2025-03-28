package Exception;

import java.util.Scanner;

public class ExceptionRevision {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println(" Connection Established");
		int size= 0;
		try {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter the 2 number for Division ");
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = a/b;
			System.out.println("Division result is " + c);
			
			System.out.println("Enter Array Length");
			size = scanner.nextInt();
			int arr[] = new int[size];
			System.out.println("Array Of Size "+size+" Got Created");
			
			System.out.println("Enter Element and postion(Index) to store the Entered Element");
			
			int elem = scanner.nextInt();
			int pos = scanner.nextInt();
			
			arr[pos] = elem();
			System.out.println("Enter in the Postion"+size+" is "+arr[pos] );	
		}
	catch(ArithmeticException e) {
		System.out.println("ArithmeticException : by 0 (zero) at line 17");
	}
	catch(NegativeArraySizeException e) {
			System.out.println("Negative Array Size : given +ve array at line 22");
		}
	
		
	}
	
	

	private static int elem() {
		// TODO Auto-generated method stub
		return 0;
	}

}
