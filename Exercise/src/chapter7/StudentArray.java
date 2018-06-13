package chapter7;

public class StudentArray {

	public static void main(String[] args) {

		Student[] studentArray = new Student[3];
		studentArray[0] = new Student(1001, "James");
		studentArray[1] = new Student(1002, "Tomas");
		studentArray[2] = new Student(1003, "Edward");
		
		for(int i=0; i<studentArray.length; i++){
			studentArray[i].showStudentInfo();
		}
	}
}
