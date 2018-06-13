package logical;

public class OperationEx5 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		boolean flag = (num1 > 0) && (num2 > 0);
		System.out.println(flag);
		
		flag = (num1 < 0) && (num2 > 0);
		System.out.println(flag);
		
		flag = (num1 > 0) || (num2 > 0);
		System.out.println(flag);
		
		flag = (num1 < 0) || (num2 > 0);
		System.out.println(flag);
		
		flag = !(num1 > 0);
		System.out.println(flag);
	}
}
