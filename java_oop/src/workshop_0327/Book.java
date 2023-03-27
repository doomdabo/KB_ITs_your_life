package workshop_0327;

public class Book {
	private String title;
	private String isbn;
	private int price;
	private String publisher;
	public Book(String isbn, String title, int price, String publisher) {
		this.title = title;
		this.isbn = isbn;
		this.price = price;
		this.publisher = publisher;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "title:" +title+", isbn:"+isbn+", price:"+price+", publisher:"+publisher;
	}
}
