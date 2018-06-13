package exception;

import java.io.FileInputStream;

public class AutoCloseTest {
	
	public static void main(String[] args) {
		AutoCloseObj obj = new AutoCloseObj();
		try (AutoCloseObj obj2 = obj){
			throw new Exception();
		}catch(Exception e) {
			System.out.println("예외 부분 입니다");
		}
	}
}
