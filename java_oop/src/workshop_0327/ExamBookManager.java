package workshop_0327;

import java.util.ArrayList;
import java.util.Iterator;

public class ExamBookManager {
	public static void main(String[] args) throws IsbnNotFoundException, IsbnExistException {
        BookManager bm = new BookManager(); 
        bm.add( new Book("123-123","자바기본",20000,"한빛") );
        bm.add( new Book("123-222","SQL",30000,"길벗") );
        bm.add( new Magazine("222-333","월간마소",25000,"한울","1달",3) );
        bm.add( new Magazine("222-433","주간프로그래밍",20000,"삼양","1주",20) );
        System.out.println("등록갯수: "+bm.getCount());
       
        ArrayList<Book> book = bm.list();
        for(Book k : book) {
        	System.out.println();
        }
        Book b = bm.findByIsbn("123-123");
        System.out.println("검색성공;"+b.toString());
        try {
            b = bm.findByIsbn("123-223");
            System.out.println("검색성공:"+b.toString());
        } catch (Exception e) {
            System.out.println("미등록 도서:"+e.getMessage());
        }
        //수정
        try {
            b.setPrice(22000);
            bm.update( b );
        } catch (Exception e) {
            System.out.println("미등록 도서:"+e.getMessage());
        }
        //삭제
        try {
            b = bm.findByIsbn("222-433");
            System.out.println("검색성공:"+b.toString());
            bm.delete(b.getIsbn());
            System.out.println("삭제성공:"+b.toString());
        } catch (Exception e) {
            System.out.println("미등록 도서:"+e.getMessage());
        }
        
    }
}
