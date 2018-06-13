package lambda;

public class TestAdd {

	public static void main(String[] args) {

		Add addF = (x, y) -> x + y;
		
		
		System.out.println(addF.add(3,5));
	}

}
