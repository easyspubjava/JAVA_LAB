package interfaceex;

public interface A {

	void aaa();
	
	default void same(){
		System.out.println("sameA");
	}
}
