package chapter7.q5;

import java.util.ArrayList;

public class DogTestArrayList {

	public static void main(String[] args) {

		ArrayList<Dog> list = new ArrayList<Dog>();
		list.add(new Dog("¸Û¸ÛÀÌ", "Ä¡¾Æ¿Í"));
		list.add(new Dog("»Ç»ß", "Áøµ¾°³"));
		list.add(new Dog("¼ø½ÉÀÌ", "»ğ»ì°³"));
		list.add(new Dog("Ã¶ÀÌ", "¸¶¸£Æ¼½º"));
		list.add(new Dog("»ßÂŞ", "Çªµé"));	
		
		
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i).showDogInfo());
		}
		
		for(Dog dog : list) {
			System.out.println(dog.showDogInfo());
		}
	}

}
