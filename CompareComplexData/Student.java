package CompareComplexData;

public class Student implements Comparable {
	int id;
	String name;
	int marks;
	
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	
	public Student(int i, String string, String string2, int j, String string3, int k) {
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getMarks()=" + getMarks() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public boolean equals(Object obj) {
		Student ref=(Student) obj;
		if(this.id==ref.id && this.name.equals(ref.name)&& this.marks==ref.marks) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int hashCode()  {
		retrn
	}


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

}
