package reference;

public class StudentTest {

	public static void main(String[] args) {
		Student4 studentLee = new Student4(1001, "Lee");
		
		studentLee.setKorean("국어", 100);
		studentLee.setMath("수학", 50);
		
		Student4 studentKim = new Student4(1002, "Kim");
		
		studentKim.setKorean("국어", 70);
		studentKim.setMath("수학", 85);
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
	}
}
