package template;

public class CarTest {

	public static void main(String[] args) {
		
		System.out.println("=== 자율주행 하는 자동차 ===");
		Car myCar = new AICar();
		myCar.run();
		
		System.out.println("=== 사람이 운전하는 자동차 ===");
		Car hisCar = new ManualCar();
		hisCar.run();
	}

}
