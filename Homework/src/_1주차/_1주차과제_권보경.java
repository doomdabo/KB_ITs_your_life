package _1주차;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1주차과제_권보경 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		long result = 0;
		long[] arr = new long[n + 1];
		long[] count = new long[m];

		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= n; i++) {
			arr[i] = (arr[i - 1] + Integer.parseInt(st.nextToken())) % m;
			if (arr[i] == 0) {
				result++;
			}
			count[(int) arr[i]]++;
		}
		for (int i = 0; i < m; i++) {
			if (count[i] > 1) {
				result += (count[i] * (count[i] - 1) / 2);
			}
		}
		System.out.println(result);
	}

}
