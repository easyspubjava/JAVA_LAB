package lambda;

public class TestMyNumber {

	public static void main(String[] args) {
		MyNumber max = (x, y)->(x>= y)? x:y; // 람다식을 인터페이스 자료형 max 변수에 대입

		System.out.println(max.getMax(10, 20));// 인터페이스 자료형 변수로 함수 호출
		
	//	MyNumber max2 = (x, y)-> x>=y ?x:y;
	//	System.out.println(max2.getMax(10, 20));
	}
}
