package inheritance;

public class VIPCustomer2{

	private int customerID;
	private String customerName;
	private String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	private int agentID;
	double saleRatio;
	
	public VIPCustomer2()
	{
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	public int calcPrice(int price){
		return price - (int)(price * saleRatio);
	}
	
	public int getAgentID(){
		return agentID;
	}
	
	public void calcBonusRatio(int price){
		bonusPoint += price * bonusRatio + 1000; 
	}
	
	public String getCustomerInfo(){
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";  
	}
}
