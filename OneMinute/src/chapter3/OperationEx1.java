package chapter3;

public class OperationEx1 {

	public static void main(String[] args) {

		int mathScore = 90;
		int engSccore = 70;
		int korScore = 100;
		
		int totalScore = mathScore + engSccore + korScore;
		System.out.println(totalScore);
		
		double avgScore = totalScore / 3.0;
		System.out.println(avgScore);
	}
}
