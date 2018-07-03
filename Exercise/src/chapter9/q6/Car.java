package chapter9.q6;

public abstract class Car {
	
	public abstract void start();
	public abstract void drive();
	public abstract void stop();
	public abstract void turnOff();
	
	public void washCar()
	{
		System.out.println("세차를 합니다");
	}

	public void run()
	{
		start();
		drive();
		stop();
		turnOff();
		washCar();
	}
}
