package chapter6.q6;

public class Card {

	private int cardNumber;
	private static int serialNum = 10000;
	
	Card(){
		serialNum++;
		cardNumber = serialNum;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

}
