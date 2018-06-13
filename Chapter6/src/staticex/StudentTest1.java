package staticex;

public class StudentTest1 {

	public static void main(String[] args) {

		Student studentLee = new Student();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum); // 초깃값 출력
		studentLee.serialNum++;					// static 변수 증가
		
		Student studentSon = new Student();
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.serialNum); // 증가된 값 출력
		System.out.println(studentLee.serialNum); // 증가된 값 출력
	}
}

