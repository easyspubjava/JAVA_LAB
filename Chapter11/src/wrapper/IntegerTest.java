package wrapper;

public class IntegerTest {

	public static void main(String[] args) {

		Integer num = 100;
		int iNum = num.intValue();  //Integer 클래스에서 정수 값만 가져옴
		int jNum = 200;
		
		int sum = iNum + jNum;
		System.out.println(sum);
		
		int total = num + jNum;   //num.inValue() + jNum 로 변환해 줌
		System.out.println(total);   
	
		Integer i = jNum;
		System.out.println(i);    //Integer.valueOf(j) 로 변환해 줌
	}
}
