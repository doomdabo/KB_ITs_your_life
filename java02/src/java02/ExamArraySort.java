package java02;

import java.util.Random;

public class ExamArraySort {

	public static void main(String[] args) {
		// 10개의 난수를 저장, 정렬
		Random r = new Random(100);
		// 10개 난수 저장
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100); // 0~99 난수 생성.
		}
		// 출력
		System.out.println("before");

		for (int i : arr) {
			System.out.println(i);
		}
		// 오름차순 정렬
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("after");
		for (int i : arr) {
			System.out.println(i);
		}

	}

}
