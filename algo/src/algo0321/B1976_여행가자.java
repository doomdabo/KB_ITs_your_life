package algo0321;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1976_여행가자 {

	static int[] parent;
	static int[][] city;
	static int[] route;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());

		parent = new int[n + 1];
		city = new int[n + 1][n + 1];
		route = new int[m+1];
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }
		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= n; j++) {
				city[i][j] = Integer.parseInt(st.nextToken());
				if (city[i][j] == 1) {
					union(i, j);
				}
			}
		}
		st = new StringTokenizer(br.readLine());

		for (int i = 1; i <= m; i++) {
			route[i] = Integer.parseInt(st.nextToken());
		}

		// 여행 계획 도시들이 1개의 대표도시로 연결됐나 확인
		int idx = find(route[1]);
		for (int i = 2; i <= m; i++) {
			if (idx != find(route[i])) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");

	}

	private static void union(int i, int j) {
		// TODO Auto-generated method stub
		i = find(i);
		j = find(j);
		if (i != j)
			parent[j] = i;
	}

	private static int find(int j) {
		// TODO Auto-generated method stub
		if (j == parent[j])
			return j;
		return parent[j] = find(parent[j]);
	}

}
