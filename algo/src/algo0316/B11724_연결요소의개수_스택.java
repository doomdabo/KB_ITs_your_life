package algo0316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B11724_연결요소의개수_스택 {
	static ArrayList<Integer>[] a;
	static boolean vis[];

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		a = new ArrayList[n + 1];
		vis = new boolean[n + 1];

		// 인접 리스트 초기화 하기
		for (int i = 1; i < n + 1; i++) {
			a[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			a[s].add(e);
			a[e].add(s); //양방향이라 둘 다에 추가
		}
		
		int cnt =0;
		for(int i = 1; i<n+1;i++) {
			if(!vis[i]) {
				cnt++;
				dfs(i);
			}
				
		}
		System.out.println(cnt);
		
	}

	private static void dfs(int v) {
		// TODO Auto-generated method stub
		if(vis[v]) return;
		vis[v] = true;
		for(int i : a[v]) {
			if(vis[i]==false)
				dfs(i);
		}
		
	}

}
