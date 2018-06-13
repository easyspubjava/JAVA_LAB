package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		String java = new String("Java");
		System.out.println("java 문자열 주소 :" +System.identityHashCode(java));//처음 생성된 메모리 주소
		
		StringBuilder buffer = new StringBuilder(java); //String으로 부터 StringBuilder생성
		System.out.println("연산 전 buufer 메모리 주소:" + System.identityHashCode(buffer));//buffer 메모리 주소
		buffer.append(" and");                // 문자열 추가
		buffer.append(" android");            // 문자열 추가
		buffer.append(" programming is fun!!!"); //문자열 추가
		System.out.println("연산 후 buufer 메모리 주소:" + System.identityHashCode(buffer));//buffer 메모리 주소
		
		java = buffer.toString(); //String 클래스로 반환
		System.out.println(java);
		System.out.println("새로 만들어진 java 문자열 주소 :" +System.identityHashCode(java)); //새로 생성된 메모리 주소

	}
}
