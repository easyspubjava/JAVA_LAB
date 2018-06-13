package inheritance;
   
public class CustomerTest3 {
	 public static void main(String[] args) {
		  VIPCustomer customerKim = new VIPCustomer(10020, "±Ë¿ØΩ≈", 12345);
		  // customerKim.setCustomerID(10020);
		  // customerKim.setCustomerName("±Ë¿ØΩ≈");
		  customerKim.bonusPoint = 10000;
		  System.out.println(customerKim.showCustomerInfo());
	 }
}
