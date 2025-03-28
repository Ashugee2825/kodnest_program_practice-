package program.series;

import java.util.Scanner;

public class ATM {
	public void login() throws Exception {
		try {
		System.out.println("Enter user id and paid number to divide and login");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int c=a/b;
		System.out.println("LOGGED IN");
	}
		catch (Exception e) {
			System.out.println("Issuse Resolved in ATM");
			throw e;
		}
		finally {
			System.out.println("Connection To DB Terminated");
		}
	}
	public class Bank {
		void initiate() {
			try {
				System.out.println("Connection to Bank Server established");
				ATM atm= new ATM();
				atm.login();
			}
			catch (Exception e) {
				System.out.println("Issused Resached Bank And Resolved in Bank");
			}
			System.out.println("Connection to Bank Server terminated");
		}
	}
public class BankApp {
	public static void main(String[] args) {
		System.out.println("main Connection Established");
		BankList bank = new BankList();
		bank.initiate();
		System.out.println("Main Connection Terminated");
	}
}
}
