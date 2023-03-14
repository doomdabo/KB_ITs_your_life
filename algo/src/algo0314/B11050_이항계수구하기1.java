package algo0314;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B11050_이항계수구하기1 {
	static int n, k;
	static int[][] d;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());

		d = new int[n + 1][n + 1];
		// 초기화
		for (int i = 0; i <= n; i++) {
			d[i][1] = i; //iC1 = i
			d[i][i] = 1; //iCi = 1
			d[i][0] = 1; //iC0 = 1
			
		}	
		for (int i = 3; i <= n; i++) {
			for (int j = 2; j < i; j++) { // 고르는 수의 개수가 전체 개수를 넘을 수 없음
				d[i][j] = d[i - 1][j] + d[i - 1][j - 1];
			}
		}

		System.out.println(d[n][k]);

	}

}
