package chapter7.array;

public class AlphaArray {

	public static void main(String[] args) {

		char[][] alphabets = new char[13][2];
		char ch = 'a';
		
		for(int i=0; i<alphabets.length; i++) {
			for(int j=0; j<alphabets[i].length; j++) {
				alphabets[i][j] = ch;
				System.out.print(alphabets[i][j] + " ");
				ch++;
			}
			System.out.println();  //°³Çà
		}
	}
}
