package java0302;

import java.util.Scanner;

public class ExamIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//학점 받아서 등급 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("학점을 입력하세요 >>");
		int ans = sc.nextInt();
		if( ans >= 90 ) System.out.println("A");
		else if(ans >= 80 ) System.out.println("B");
		else if(ans >= 70 ) System.out.println("C");
		else if(ans >= 60 ) System.out.println("D");
		else System.out.println("F");
	}

}