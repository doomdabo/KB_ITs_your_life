package workshop_0327;

public class IsbnExistException extends Exception {
	
	private String isbn;
	public IsbnExistException(String isbn) {
		this.isbn = isbn;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	} //오류 메시지 표시
}
