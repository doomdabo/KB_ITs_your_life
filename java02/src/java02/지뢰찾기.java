package java02;

import java.util.Random;
import java.util.Scanner;

public class 지뢰찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] dx = new int[] { -1, -1, 0, 1, 1, 1, 0, -1 };
		int[] dy = new int[] { 0, 1, 1, 1, 0, -1, -1, -1 };
		// 지뢰 정보 저장 2차원 배열
		int[][] mineMap = new int[12][12]; // out of range 막기 위해 1씩 껍데기 상하좌우 추가
		// 임의의 좌표에 지뢰 지정 5개
		Random r = new Random(100);
		for (int i = 0; i < 5; i++) {
			int x = r.nextInt(10) + 1; // 1~10으로 범위 제한
			int y = r.nextInt(10) + 1;
			mineMap[x][y] = 9; // 9는 지뢰위치
			for (int j = 0; j < 8; j++) {
				int nx = x + dx[j];
				int ny = y + dy[j];
				mineMap[nx][ny]++;
			}
			// 지뢰 주위 8개 좌표 값을 1 증가
//			mineMap[x - 1][y]++; // 상
//			mineMap[x - 1][y + 1]++; // 상우
//			mineMap[x][y + 1]++; // 우
//			mineMap[x + 1][y + 1]++; // 우하
//			mineMap[x + 1][y]++; // 하
//			mineMap[x + 1][y - 1]++; // 좌하
//			mineMap[x][y - 1]++; // 좌
//			mineMap[x - 1][y - 1]++; // 좌상
		}
//		
//		for (int[] mm : mineMap) {
//			for (int m : mm) {
//				System.out.print(m + " ");
//			}
//			System.out.println();
//		}
		int foundMine = 0;
		boolean[][] userMap = new boolean[12][12];

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("x좌표 입력하세요(1~10) ");
			int ux = sc.nextInt();
			System.out.println("y좌표 입력하세요(1~10) ");
			int uy = sc.nextInt();
			userMap[ux][uy] = true; // 게이머가 입력한 좌표
			// 게이머가 입력한 좌표 결과를 표시
			for (int i = 0; i < userMap.length; i++) {
				for (int j = 0; j < userMap.length; j++) {
					if (userMap[i][j] == true) // 게이머가 입력한 좌표의 경우
						System.out.print(mineMap[i][j] + " ");
					else {
						System.out.print("X ");// 게이머가 입력한 좌표 아닌경우
					}
				} // end for j
				System.out.println();
			}
			if(mineMap[ux][uy] >= 9) {
				foundMine++;
				if(foundMine==5) break;
			}
		}

	}

}
