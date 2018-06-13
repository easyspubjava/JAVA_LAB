package interfaceex;

public class CATest {

	public static void main(String[] args) {

		CA ca = new CA();
	
		A ia = ca;
		ia.aaa();
		ia.same();
		
		B ib = ca;
		ib.bbb();
		ib.same();
		
		if( ib instanceof CA){
			CA ca2 = (CA)ib;
			ca2.aaa();
			ca2.bbb();
		}
		
		ca.same();
	}
}