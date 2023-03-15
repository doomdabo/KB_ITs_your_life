package algoTest_0315;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class kb3반_알고리즘3번_권보경 {
	static int[][] board;
	static boolean[][] vis;
	static int check;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		/* 보드판 입력 받기 */
		board = new int[19][19];
		vis = new boolean[19][19];
		for (int i = 0; i < 19; i++) {
			st = new StringTokenizer(br.readLine());// 한줄 입력받고
			for (int j = 0; j < 19; j++) { // 잘라서 board에 저장
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}

//		for(int i=0;i<19;i++) {
//			for(int j=0;j<19;j++) {
//				System.out.print(board[i][j]+" ");
//			}
//			System.out.println();
//		}
		for (int i = 0; i < 19; i++) {
			for (int j = 0; j < 19; j++) {
				if(board[i][j]==0) continue;
				if(board[i][j] == 1 || board[i][j] ==2) {
					int who = board[i][j]; //1인지 2인지 저장
					board[i][j]=-1;
					if(checkRight(i,j,who)||checkDown(i,j,who)||checkDia1(i,j,who)||checkDia2(i,j,who)) { //승리라면
						System.out.println(who);
						System.out.println((i+1)+" "+(j+1));
						check = 1;
						return;
					}
				}
			}
		}
		if(check == 0) {
			System.out.println(0);
			return;
		}
	}

	private static boolean checkRight(int st_x, int st_y, int who) {
		//오른쪽 방향 오목 체크
		int cnt = 1;
		for (int i = 1; i < 5; i++) {
			int nx = st_x;
			int ny = st_y+i;
			if(nx<0||ny<0||nx>=19||ny>=19) continue;
			if (board[nx][ny] == who) {
				cnt++;
				//board[nx][ny] =-1;
			}
		}

		if(cnt == 5) {
			int nx = st_x;
			int ny = st_y+5;
			int nny = st_y-1;
			if(nx<0||ny<0||nx>=19||ny>=19) return true;
			if(board[nx][ny]==who) return false; //만약 6개 완성이라면 이긴것이 아님 7개 이상은 못하겠어요........
			if(nny>=0&&board[nx][nny]==who) return false;
			else return true; //승리
		}
		return false;
	}
	private static boolean checkDown(int st_x, int st_y, int who) {
		//아래 방향 오목 체크
		int cnt = 1;
		for (int i = 1; i < 5; i++) {
			int nx = st_x+i;
			int ny = st_y;
			if(nx<0||ny<0||nx>=19||ny>=19) continue;
			if (board[nx][ny] == who) 
				cnt++;
		}
		if(cnt == 5) {
			int nx = st_x+5;
			int ny = st_y;
			int nnx = st_x -1;
			if(nx<0||ny<0||nx>=19||ny>=19) return true;
			if(board[nx][ny]==who) return false; //만약 6개 완성이라면 이긴것이 아님
			if(nnx>=0&&board[nnx][ny]==who) return false;

			else return true; //승리
		}
		return false;
	}
	private static boolean checkDia1(int st_x, int st_y, int who) {
		//우하향 대각선 체크
		int cnt = 1;
		for (int i = 1; i < 5; i++) {
			int nx = st_x+i;
			int ny = st_y+i;
			if(nx<0||ny<0||nx>=19||ny>=19) continue;
			if (board[nx][ny] == who)
				cnt++;
		}
		if(cnt == 5) {
			int nx = st_x+5;
			int ny = st_y+5;
			if(nx<0||ny<0||nx>=19||ny>=19) return true;
			if(board[nx][ny]==who) return false; //만약 6개 완성이라면 이긴것이 아님
			else return true; //승리
		}
		return false;
	}
	private static boolean checkDia2(int st_x, int st_y, int who) {
		//우상향 대각선 체크
		int cnt = 1;
		for (int i = 1; i < 5; i++) {
			int nx = st_x-i;
			int ny = st_y+i;
			if(nx<0||ny<0||nx>=19||ny>=19) continue;
			if (board[nx][ny] == who)
				cnt++;
		}
		if(cnt == 5) {
			int nx = st_x+5;
			int ny = st_y+5;
			if(nx<0||ny<0||nx>=19||ny>=19) return true;
			if(board[nx][ny]==who) return false; //만약 6개 완성이라면 이긴것이 아님
			else return true; //승리
		}
		return false;
	}
}
