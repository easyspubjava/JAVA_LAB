package chapter14;

public class Test {

	public static void main(String[] args) {

		
		String pass = new String("abc");
		System.out.println(pass.matches("[a-zA-Z]+")); //true
		
		String pass2 = new String("abc1");
		System.out.println(pass2.matches("[a-zA-Z]+")); //false
	}
}
