package algo0309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2018_수들의합5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken());
		int start = 1, end = 1;
		int cnt = 0, sum = 1;
		while (end <= n) {
			{
				if (sum == n) {
					cnt++;
					end++;
					sum += end;
				} else if (sum < n) {
					end++;
					sum += end;
				} else if (sum > n) {
					sum -= start++;
				}
			}
		}
		System.out.println(cnt);

	}
}
