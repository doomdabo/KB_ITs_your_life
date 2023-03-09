package algo0309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11660_구간합구하기5 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n+1][n+1];
		int[][] d = new int[n+1][n+1];
		//배열 입력 받기
		for(int i=1;i<=n;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1;j<=n;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		//배열의 구간합 계산하기
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				d[i][j] = d[i][j-1]+d[i-1][j]-d[i-1][j-1]+arr[i][j];
			}
		}
		//m번만큼 반복하기
		for(int i=0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int ans = d[x2][y2]-d[x2][y1-1]-d[x1-1][y2]+d[x1-1][y1-1];
			sb.append(ans).append("\n");
		}
		System.out.print(sb);
	}

}
