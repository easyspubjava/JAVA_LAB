package cooperation;

public class Subway {
	 public String lineNumber;           // 지하철 노선 번호
	 public int passengerCount;          // 승객 수 
	 public int money;                   // 수입 액
	    
	 public Subway(String lineNumber) {   // 지하철 노선 초기화
		  this.lineNumber = lineNumber;   
	 }
	    
	 public void take(int money) {         // 승객이 탄 경우 
		  this.money += money;               // 수입 증가
		  passengerCount++;                  // 승객 수 증가
	 } 
	    
	 public void showInfo()              // 지하철 정보 출력
	 {
		  System.out.println(lineNumber + "의 승객은 " + passengerCount +"명이고, 수입은 " + money + "입니다.");
	 }

}
