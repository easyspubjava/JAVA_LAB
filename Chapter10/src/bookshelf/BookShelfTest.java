package bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {

		Queue shelfQueue = new BookShelf();
		shelfQueue.enQueue("ลยน้ป๊ธฦ 1");
		shelfQueue.enQueue("ลยน้ป๊ธฦ 2");
		shelfQueue.enQueue("ลยน้ป๊ธฦ 3");
		
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		
	}
}
