package ifexample;

public class IfExample4 {

	public static void main(String[] args) {
		int age = 10;
		int charge = 0;
		int i = 10;
		
		if(age < 8){
			charge = 1000; 
		}
		if(age < 14 ){
			charge = 2000;
		}
		if(age < 20 && (i+=2) < 0){
			charge = 2500;
		}
	
		
		System.out.println("입장료는 " + charge + "원 입니다.");
		System.out.println(i);
	}

}
