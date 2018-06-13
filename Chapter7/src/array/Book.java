package array;

public class Book {

	private String bookName;
	private String author;
	
	public Book(){}
	
	public Book(String bookName, String author){
		this.bookName = bookName;
		this.author = author;
	}
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void showBookInfo(){
		System.out.println(bookName + "," + author);
	}
}
