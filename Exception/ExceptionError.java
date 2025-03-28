package Exception;

public class ExceptionError {
	public static void main(String[] args) {
		ExceptionError.greet();
	}
	public static void greet() {
		try{
			System.out.println("Hello");
			greet();
		}
	catch (Error e) {
		System.out.println("Some Error is Occured");
	}
		//System.out.println("Connection Terminated");
	
	}

}
