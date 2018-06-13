package arithmetic;

public class OperationEx3 {
	 public static void main(String[] args) {
		  int gameScore = 150;           // 게임에서 획득한 점수는 150점
		
		  int lastScore1 = ++gameScore;  // gameScore에 1 더한 값을 lastScore1에 대입
		  int lastScore2 = --gameScore;   // gameScore에서 1을 뺀 값을 lastScore2에 대입
		
		  System.out.println(lastScore1);  // 151
		  System.out.println(lastScore2);  // 150
	 }
}

