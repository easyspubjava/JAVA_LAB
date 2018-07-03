package chapter7.q3;

public class ArrayTest2 {

	public static void main(String[] args) {

		int[] number = new int[] {2,4,6,8,10};
		int total = 0;
					
		for(int i=0; i<number.length; i++){
			total += number[i];
		}
		
		System.out.println("2부터 10까지 짝수의 합은 " + total + "입니다");
	}
}
