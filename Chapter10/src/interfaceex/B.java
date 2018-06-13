package interfaceex;

public interface B {
	
	void bbb();
	
	default void same(){
		System.out.println("sameB");
	}
}
