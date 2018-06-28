package interfaceex;

public interface Buy {

	void buy();
	
	default void order(){
		System.out.println("구매 주문");
	}
}



