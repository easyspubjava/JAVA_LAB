package abstractex;

public class DeskTop extends Computer{
	

	@Override
	public void display() {
		System.out.println("DeskTop Display()");
	}

	@Override
	public void typing() {
		System.out.println("DeskTop Typing()");		
	}

}
