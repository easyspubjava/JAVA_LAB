package chapter9.template;

public class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("사람이 운전합니다");
		System.out.println("사람이 핸들을 조작합니다");
	}

	@Override
	public void stop() {
		System.out.println("브레이크로 정지합니다");
		
	}

	@Override
	public void wiper() {
		System.out.println("사람이 빠르기를 조절합니다");
	}
}
