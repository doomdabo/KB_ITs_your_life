package workshop2_0327;

public class Book extends Rental{
	private String author;
	private int page;
	
	
	public Book(int num, String title, int rentfee, String state, String author, int page) {
		super(num, title, rentfee, state);
		this.author = author;
		this.page = page;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	
	

}
