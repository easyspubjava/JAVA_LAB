package chapter6.staticex;

public class StudentTest6 {

	public static void main(String[] args) {

		Student3 studentKim = new Student3();
		System.out.println("학번: " + studentKim.studentID + ", 카드 번호: " + studentKim.cardNumber);
		
		Student3 studentLee = new Student3();
		System.out.println("학번: " + studentLee.studentID + ", 카드 번호: " + studentLee.cardNumber);
	}
}
