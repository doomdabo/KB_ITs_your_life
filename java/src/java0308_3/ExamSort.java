package java0308_3;

import java.util.Arrays;

public class ExamSort {

	public static void main(String[] args) {
		int[] arr = new int[] {3,7,5,1,4};
		Arrays.sort(arr);
		System.out.println(arr);
		for(int i:arr) {
			System.out.println(i);
		}		
		String s = Arrays.toString(arr);
		System.out.println(s);
	}

}
