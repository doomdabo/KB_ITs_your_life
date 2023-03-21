package alone;

import java.io.*;
import java.util.*;

public class B2606_바이러스 {
	static int n, m, cnt;
	static ArrayList<Integer>[] arr;
	static boolean[] vis;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(br.readLine());

		arr = new ArrayList[n + 1];
		vis = new boolean[n + 1];
		for (int i = 1; i <= n; i++) {
			arr[i] = new ArrayList<Integer>();
		}

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			arr[start].add(end);
			arr[end].add(start);
		}
		bfs(1);
		System.out.println(cnt);
	}

	private static void dfs(int i) {
		vis[i] = true;
		for(int v : arr[i]) {
			if(!vis[v]) {
				cnt++;
				dfs(v);
			}
		}
	}
	private static void bfs(int i) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(i);
		vis[i] = true;
		while(!q.isEmpty()) {
			int cur = q.poll();
			for(int v:arr[cur]) {
				if(!vis[v]) {
					cnt++;
					vis[v] = true;
					q.add(v);
				}
			}
		}
	}

}
