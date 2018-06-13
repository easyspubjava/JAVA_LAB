package string;

public class StringTest1 {

	public static void main(String[] args) {

		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);    //false
		System.out.println(str1.equals(str2)); //true
	
		String str3 = "abc";
		String str4 = "abc";
	
		System.out.println(str3 == str4);  //true
		System.out.println(str3.equals(str4)); //true
	}
}
