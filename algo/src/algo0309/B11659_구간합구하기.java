package algo0309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11659_구간합구하기 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int n, m, i, j;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		int[] arr = new int[n+1];
		int[] d = new int[n+1];
		d[0] = 0;
		st = new StringTokenizer(br.readLine());
		for (int t = 1; t <= n; t++) {
			d[t] = d[t - 1] + Integer.parseInt(st.nextToken());
		}
		for (int t = 0; t < m; t++) {
			st = new StringTokenizer(br.readLine());
			i = Integer.parseInt(st.nextToken());
			j = Integer.parseInt(st.nextToken());
			System.out.println(d[j]-d[i-1]);
		}

	}

}
