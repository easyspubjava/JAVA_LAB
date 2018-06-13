package generics.factory;

public class ShipFactory <T extends Ship>{
	
	public void addFuel(T t) {
		 t.addFuel(100);
	}
	
	public void fixShip(T t) {
		System.out.println(t.name+ "를 수리했습니다.");
	}
}
