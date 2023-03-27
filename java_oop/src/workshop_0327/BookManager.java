package workshop_0327;

import java.util.ArrayList;

import java_oop_0324.vo.MyShape;

public class BookManager {
	private ArrayList<Book> arr = new ArrayList<>();
	//등록
	public void add(Book b) throws IsbnExistException{
		for(Book book : arr) {
			if(book.getIsbn() == b.getIsbn()) {
				throw new IsbnExistException(b.getIsbn());
			}
		}
		arr.add(b);
	}
	public void add(Magazine m) throws IsbnExistException{
		for(Book book : arr) {
			if(book.getIsbn() == m.getIsbn()) {
				throw new IsbnExistException(m.getIsbn());
			}
		}
		arr.add(m);
	}
	//검색
	public int getCount(){
		return arr.size();
	}
	
	public ArrayList<Book> list(){
		System.out.println("**전체 출력**");
		ArrayList<Book> t = new ArrayList<>();
		for(Book book : arr) 
			t.add(book);
		return t;
	}
	public Book findByIsbn(String isbn) throws IsbnNotFoundException{
		for(Book book : arr) {
			if(book.getIsbn().equals(isbn)) return book;
		}
		throw new IsbnNotFoundException(isbn);
	}
	//수정
	public void update(Book b) throws IsbnNotFoundException{
		b.setIsbn(b.getIsbn());
		b.setPrice(b.getPrice());
		b.setPublisher(b.getPublisher());
		b.setTitle(b.getTitle());
	}
	public void update(Magazine b) throws IsbnNotFoundException{
		b.setIsbn(b.getIsbn());
		b.setPrice(b.getPrice());
		b.setPublisher(b.getPublisher());
		b.setTitle(b.getTitle());
		b.setPeriod(b.getPeriod());
		b.setNum(b.getNum());
	}

	//삭제
	public void delete(String isbn) throws IsbnNotFoundException{
        Book findBook = findByIsbn(isbn);
        // Arraylist에 저장중. 삭제시 인덱시 검색이 필요
        int index = -1;
        for (int i = 0; i < arr.size(); i++) {
            Book book = arr.get(i);
            if(book.getIsbn().equals(isbn)) {
                index = i;
                break;
            }
        }//end for
        arr.remove(index);		
        throw new IsbnNotFoundException(isbn);
	}
}


/*
 * 
 *  BookManager 클래스 메서드 
//등록
public void add(단행본  b) throws IsbnExistException{}
public void add(잡지  b) throws IsbnExistException{}
//검색
public int  getCount(){}
public ArrayList<Book> list(){}
public Book findByIsbn(String isbn) throws IsbnNotFoundException{}
//수정
public void update(단행본  b) throws IsbnExistException{}
public void update(잡지  b) throws IsbnExistException{}
//삭제
public void delete(String isbn) throws IsbnExistException{}*/
 