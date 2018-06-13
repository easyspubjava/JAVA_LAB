package inheritance;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "이순신");
		//customerLee.setCustomerID(10010);
		//customerLee.setCustomerName("이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());

		VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 12345);
		//customerKim.setCustomerID(10020);
		//customerKim.setCustomerName("김유신");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
	}
}
