package ifexample;

import java.io.IOException;

public class IfExample1 {

	public static void main(String[] args) throws IOException {
		
		int age = 2;
		
		if( age >= 8 ){
			System.out.println("학교에 다닙니다.");
		}
		else{
			System.out.println("학교에 다니지 않습니다.");
		}
	}
}
