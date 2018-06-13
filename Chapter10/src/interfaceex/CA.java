package interfaceex;

public class CA implements A, B{

	@Override
	public void bbb() {
		System.out.println("bbb");
	}

	@Override
	public void aaa() {
		System.out.println("aaa");
	}

	@Override
	public void same() {
		System.out.println("same CA");
	}

}
