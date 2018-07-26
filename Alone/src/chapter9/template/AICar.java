package chapter9.template;

public class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("자율 주행합니다");
		System.out.println("자동차가 스스로 방향을 전환합니다.");
	}

	@Override
	public void stop() {
		System.out.println("스스로 멈춥니다.");		
	}

	@Override
	public void wiper() {
		System.out.println("비나 눈의 양에 따라 빠르기가 자동으로 조절됩니다");		
	}
}
