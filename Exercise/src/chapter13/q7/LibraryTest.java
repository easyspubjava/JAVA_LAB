package chapter13.q7;

import java.util.ArrayList;
import java.util.List;

class Book{
	String name;
	int price;
	
	Book(String name, int price){
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}

public class LibraryTest {

	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>( );
		
		bookList.add(new Book("자바", 25000));
		bookList.add(new Book("파이썬", 15000));
		bookList.add(new Book("안드로이드", 30000));
		
		//스트림 생성하고 출력하기
		int totalPrice = bookList.stream().mapToInt(b->b.getPrice()).sum();
		System.out.println("모든 책 가격의 합은 " + totalPrice + "원 입니다");
		bookList.stream().filter(b->b.getPrice() >= 20000).map(b->b.getName()).sorted().forEach(s->System.out.println(s));
	}
}
