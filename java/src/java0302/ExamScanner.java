package java0302;
import java.util.Scanner;
public class ExamScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next(); //문자열 읽기
		System.out.println("읽은 문자열 : " + s1);
		String s2 = sc.nextLine(); //문자열 읽기
		System.out.println("읽은 문자열 : " + s2);	
		int integer1 = sc.nextInt(); // 숫자 읽기
		System.out.println("읽은 숫자: "+ integer1);
	}
}
