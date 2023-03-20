package algo0316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2839_설탕배달 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());

		int ans = -1;

		int three = n / 3;
		int five = n / 5;

		for (int i = 0; i < three + 1; i++) {
			for (int j = 0; j < five + 1; j++) {
				if (i * 3 + j * 5 == n) {
					ans = i + j;
					System.out.println(ans);
					return;
				}
			}
		}
		System.out.println(ans);
	}

}
