package java_oop_0327;


import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exam예외 {

	public static void main(String[] args) {//throws Exception 
		// TODO Auto-generated method stub
		try { //정상 
			int [] arr= {1,3,5};
			System.out.println(arr[3]);
			new FileReader("hello.txt");
			System.out.println("파일열기성공");
			//하나의 작업 위 쪽에서 정상적으로 실행되었을때 정상적으로 실행될 코드의 덩어리: 트랜잭션 
			String s=null;
			System.out.println(s.length());
		}catch(ArrayIndexOutOfBoundsException ae) {//자식타입 
			System.out.println("배열접근실패"+ae.getMessage());
			ae.printStackTrace();
		}catch(FileNotFoundException fe) {
			System.out.println("파일오픈실패 "+fe.getMessage());
			fe.printStackTrace();
		}
		catch(Exception e) {//부모타입 
			System.out.println("기타예외"+e.getMessage());
		}
		//try catch 또는 throws Exception 둘중하나 
		System.out.println("프로그램 종료 ");
	}

}
