package operator;

public class OperationEx5 {

	public static void main(String[] args) {
		int num = 0B10000101;  //5 를 이진수로 나타냄 (8비트)
		 
		System.out.println(num << 2);   //왼쪽으로 2비트 이동 00010100 (20)
		System.out.println(num >> 2);   //오른쪽으로 2비트 이동 00000001 (1)
		System.out.println(num >>> 2);  //오른쪽으로 2비트 이동 00000001 (1)
		System.out.println(num);
		
		num = num << 2;  //왼쪽으로 2비트 이동한 값을 다시 num애 대입
		System.out.println(num);
	}
}
