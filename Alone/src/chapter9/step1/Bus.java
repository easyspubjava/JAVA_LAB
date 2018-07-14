package chapter9.step1;

public class Bus extends Car{

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
		
	}

	@Override
	public void refuel() {
		System.out.println("천연 가스를 충전 합니다.");
	}
	
	public void takePassenger() {
		System.out.println("승객을 버스에 태웁니다.");
	}
}
