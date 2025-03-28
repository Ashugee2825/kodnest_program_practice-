package GenericOveride;

public class Student {
	String name;
	int id;
	String email;
	int age;

	public Student(String name, int id, String email, int age) {
		super();
		this.name = name;
		this.id = id;
		this.email = email;
		this.age = age;
	}
	@Override 
	public String toString() {
		String message ="name = "+name+"| id ="+id+" | email = "+email+" |age= "+age;
			return message;
	}
	

}

