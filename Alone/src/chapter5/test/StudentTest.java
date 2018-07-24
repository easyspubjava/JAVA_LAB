package chapter5.test;

import chapter5.Student;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.address = "서울 양천구";  //address의 접근 제어자를 public으로 변경하면 오류 없어짐
		//studentLee.studentName = "이상원";
		studentLee.setStudentName("이상원");
		
		System.out.println(studentLee.getStudentName());
	}
}

