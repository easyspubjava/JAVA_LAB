package thisex;

class BirthDay{

	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);  //this 출력해보기
	}
}

public class ThisExmaple {

	public static void main(String[] args) {
		
		BirthDay bDay = new BirthDay();
		bDay.setYear(2000);
		System.out.println(bDay);
		bDay.printThis();
	}
}
