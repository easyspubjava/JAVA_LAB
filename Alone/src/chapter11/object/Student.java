package chapter11.object;

public class Student {
	int studentID;
	String name;
	
	public Student(int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	}
	
	public String toString() {
		return studentID + "," + name;
	}
}
