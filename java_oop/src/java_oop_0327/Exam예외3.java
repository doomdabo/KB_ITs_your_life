package java_oop_0327;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exam예외3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileReader fr = load_file();//파일 열기 실패, 성공을 알 수 없다.
		System.out.println(fr);
		FileReader fr2=null;
		try {
			fr2 = load_file2(); //파일 열기 성공이면 주소값 반환
		} catch (FileNotFoundException e) { //실패면 catch 문 실행
			e.printStackTrace();
		}
		System.out.println(fr2);
	}

	private static FileReader load_file2() throws FileNotFoundException{
		FileReader fr = null;
		fr = new FileReader("hello.txt");
		return fr;
	}

	private static FileReader load_file() {
		FileReader fr = null;
		try{
			fr = new FileReader("hello.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("파일 열기 실패");
			e.printStackTrace();
		};
		return fr;
	}

}
