package java02;

public class Exam구구단배열 {

	public static void main(String[] args) {
		// 2차원 배열 arr에 구구단 결과값을 저장하는 코드를 작성
		// 단번호 인덱스 동일하게
		// ex:
		// arr[2][1] -> 2 / arr[2][2] -> 4
		// arr[8][5] -> 40 / arr[9][9] -> 81
		// 생성 따로 for문으로 값을 저장
		int[][] arr = new int[10][10];
		for (int i = 2; i <= 9; i++) {
			System.out.println("********" + i + "단********");
			for (int j = 1; j <= 9; j++) {
				arr[i][j] = i * j;
				System.out.println(i + " * " + j + " = " + arr[i][j]);
			}
		}

	}

}
