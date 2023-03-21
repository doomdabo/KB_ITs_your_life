package algo0320;

import java.io.*;
import java.util.*;

public class B2178_미로탐색 {
	static int[][] board;
	static int[][] vis;
	static int n, m;
	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 };

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		board = new int[n][m];
		vis = new int[n][m];
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			for (int j = 0; j < m; j++) {
				board[i][j] = s.charAt(j) - '0'; //문자열을 int로 바꾸려면 이렇게 '0'을 빼줘서 저장한다
			}
		}
		vis[0][0] = 1; //맨처음부터 방문 시작
		Queue<int[]> q = new LinkedList<>();//큐 생성 배열을 자료형으로 가짐
		q.add(new int[] {0,0});
		while(!q.isEmpty()) {
			int cur[] = q.poll();
			int curX = cur[0];
			int curY = cur[1];
			
			for(int dir = 0; dir<4;dir++) {
				int nx = curX + dx[dir];
				int ny = curY + dy[dir];
				if(nx<0||ny<0||nx>=n||ny>=m) continue;
				if(board[nx][ny]==0||vis[nx][ny]>0) continue;
				vis[nx][ny] = vis[curX][curY] + 1;
				q.add(new int[] {nx,ny});
			}
		}
		System.out.println(vis[n-1][m-1]);
		
	}

}
