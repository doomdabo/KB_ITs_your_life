package algo0317;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B13023_ABCDE {
	static int n, m;
	static StringBuilder sb = new StringBuilder();
	static ArrayList<Integer>[] arr;
	static boolean[] vis;
	static int check;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new ArrayList[n];
		vis = new boolean[n];
		for (int i = 0; i < n; i++) {
			arr[i] = new ArrayList<Integer>();
		}
		// 친구 관계 입력받기: m개
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a].add(b);
			arr[b].add(a);
		}
		for (int i = 0; i < n; i++) {
			dfs(i, 1);// depth = 1 부터 시작, i=0부터 순차 탐색
			if (check == 1)
				break;
		}
		System.out.println(check);

	}

	private static void dfs(int now, int depth) {
		if (depth == 5) {
			check = 1;
			return;
		}
		vis[now] = true;
		for (int i : arr[now]) { // 각 어레이리스트 내부를 탐방함
			// 현재 노드의 연결 노드 중 방문하지 않은 노드로 DFS 실행
			if (!vis[i]) {
				// 만약 방문 안했으면 거기서 또 DFS시작
				dfs(i, depth + 1);
			}
		}
		vis[now] = false;
	}

}
