package stream;

public class TravelCustomer {

	private String name;   //이름
	private int age;       //나이
	private int price;     //가격
	
	public TravelCustomer(String name, int age, int price) {
		this.name = name;
		this.age = age;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getPrice() {
		return price;
	}
	
	public String toString() {
		return "name: " + name + "age: " + age + "price: " + price; 
	}
}
