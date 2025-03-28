package Exception;

import java.util.Scanner;
import java.util.*;


public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("Connection Established");
		try {
	
     	Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers for division");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = a/b;
		System.out.println("Division Result is: " +c);
		
	} catch(Exception e) {
		System.out.println("ArithmeticException: /by Zero at line 14 ");
	    System.out.println("Connection TERMINATED");

}
}
}
