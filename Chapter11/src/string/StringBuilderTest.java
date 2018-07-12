package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		String javaStr = new String("Java");
		System.out.println("javaStr 문자열 주소 :" +System.identityHashCode(javaStr));//처음 생성된 메모리 주소
		
		StringBuilder buffer = new StringBuilder(javaStr); //String으로 부터 StringBuilder생성
		System.out.println("연산 전 buffer 메모리 주소:" + System.identityHashCode(buffer));//buffer 메모리 주소
		buffer.append(" and");                // 문자열 추가
		buffer.append(" android");            // 문자열 추가
		buffer.append(" programming is fun!!!"); //문자열 추가
		System.out.println("연산 후 buffer 메모리 주소:" + System.identityHashCode(buffer));//buffer 메모리 주소
		
		javaStr = buffer.toString(); //String 클래스로 반환
		System.out.println(javaStr);
		System.out.println("새로 만들어진 javaStr 문자열 주소 :" +System.identityHashCode(javaStr)); //새로 생성된 메모리 주소

	}
}
