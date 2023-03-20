package algo0316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B1260_DFS와BFS {
	static ArrayList<Integer>[] a; // 선언
	static boolean[] vis;
	static StringBuilder sb;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());

		sb = new StringBuilder();
		vis = new boolean[n + 1];

		a = new ArrayList[n + 1]; // 정점 공간을 생성 - 할당
		for (int i = 1; i < n + 1; i++) {
			a[i] = new ArrayList<Integer>(); // 초기화
		}
		// 배열에 입력 받은 값 저장
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			a[s].add(e);
			a[e].add(s);
		}

		// 방문할 수 있는 정점이 여러 개인 경우에는 번호가 작은 것을 먼저 방문 하기 위해 정렬
		for (int i = 1; i <= n; i++) {
			Collections.sort(a[i]);
		}

		dfs(v);
		sb.append("\n");
		vis = new boolean[n + 1];
		
		bfs(v);
		System.out.println(sb);
	}

	private static void bfs(int v) {
		// TODO Auto-generated method stub
		vis[v] = true;
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(v);
		while(!q.isEmpty()) {
			int cur = q.poll();
			sb.append(cur+" ");

			for(int i : a[cur]) {
				if(!vis[i]) {
					vis[i] = true;
					q.add(i);
				}
			}
		}
	}

	private static void dfs(int v) {
		// TODO Auto-generated method stub
		vis[v] = true;
		sb.append(v).append(" ");
		for (int i : a[v]) {
			if (vis[i] == false) {
				dfs(i);
			}
		}
	}

}
