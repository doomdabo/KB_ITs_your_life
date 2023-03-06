package java01;

import java.util.Scanner;

public class ExamSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//학점 받아서 등급 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("학점을 입력하세요 >>");
		int ans = sc.nextInt();
		switch(ans/10) {
		case 10:
		case 9: 
			System.out.println("A");
			break;
		case 8: 
			System.out.println("B");
			break;
		case 7: 
			System.out.println("C");
			break;
		case 6: 
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
	}

}
