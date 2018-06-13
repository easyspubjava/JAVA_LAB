package chapter7;

public class Student {

	private int studentID;
	private String name;
	
	Student(int studentID, String name){
		this.studentID = studentID;
		this.name = name;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void showStudentInfo(){
		System.out.println(studentID + "," + name);
	}
}
