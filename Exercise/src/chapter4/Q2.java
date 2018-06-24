package chapter4;

public class Q2 {

	public static void main(String[] args) {

		int dan;
		int times;
		
		for(dan = 2; dan <=9; dan++){
			if (dan %2 != 0) continue;
			for(times = 1; times <=9; times++){
				System.out.println(dan + "X" + times + "=" + dan * times);
			}
			System.out.println();
		}
	}
}
