package java0302;

import java.util.Random;
import java.util.Scanner;

public class ExamUtilWhile {
	public static void main(String[] args) {
		Random random = new Random();
		int r = random.nextInt(100);// 0-99 난수생성
		// 인텔리제이 ctrl+alt+v == ctrl + 1 변수명 assign
		System.out.println("난수 : " + r);
		Scanner sc = new Scanner(System.in);
		int ans = -1;
		while (r != ans) {
			System.out.println("0-99 사이 숫자 입력하세요: ");
			ans = sc.nextInt();
			if (r == ans) {
				System.out.println("정답입니다..");
			} else if (r < ans) {
				System.out.println("숫자 낮춰주세요");
			} else {
				System.out.println("숫자 높여주세요");
			}
		}
	}
}
