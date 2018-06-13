package ex;

public class CarFactoryTest {

	public static void main(String[] args) {

		CarFactory factory = CarFactory.getInstance();  //싱글톤 패턴
		
		Car mySonata = factory.createCar();   //메서드에서 Car 생성
		Car yourSonata = factory.createCar();
		
		System.out.println(mySonata.getCarNum());    //10001  출력
		System.out.println(yourSonata.getCarNum());  //10002  출력
		
	}
}
