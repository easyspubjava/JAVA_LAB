package generics.factory;

public class Vehicle {

	int fuel;
	String name;
	
	public Vehicle(String name ) {
		this.name = name;
	}
	public void addFuel(int f) {
		fuel += f;
	}
}

class Car extends Vehicle{

	public Car(String name) {
		super(name);
	}
}

class Ship extends Vehicle{

	public Ship(String name) {
		super(name);
	}
	
}

class Taxi extends Car{

	public Taxi(String name) {
		super(name);
	}
}

class AutoCar extends Car{

	public AutoCar(String name) {
		super(name);
	}
}

class Boat extends Ship{

	public Boat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
}

class Cruze extends Ship{

	public Cruze(String name) {
		super(name);
	}
	
}


