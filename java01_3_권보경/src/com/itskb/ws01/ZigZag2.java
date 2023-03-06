package com.itskb.ws01;

public class ZigZag2 {

	public static void main(String[] args) {
		int[][] intArray = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 } };
		for (int i = 0; i < intArray[0].length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < intArray.length; j++) {
					System.out.print(intArray[j][i] + " ");
				}
				System.out.println();
			} else {
				for (int j = intArray.length - 1; j >= 0; j--) {
					System.out.print(intArray[j][i] + " ");
				}
				System.out.println();
			}
		}
	}

}
