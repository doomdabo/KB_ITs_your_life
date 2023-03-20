package algo0317;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B1325_효율적인해킹 {
	static int n, m;
	static ArrayList<Integer> [] arr;
	static StringBuilder sb = new StringBuilder();
	static boolean[] vis;
	static int[] ans;
	static int max;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new ArrayList[n+1];
		ans = new int[n+1];
		vis = new boolean[n+1];
		for(int i = 1;i<=n;i++) {
			arr[i] = new ArrayList<Integer>();
		}
		for(int i=0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a].add(b);
			//단방향으로 생각..
		}
		for(int i = 1;i<n+1;i++) {
			vis = new boolean[n+1];
			dfs(i);
		}

		for(int i = 1;i<=n;i++) 
			max = Math.max(max, ans[i]);
		for (int i = 1; i <= n; i++) {
			if (ans[i] == max) {
				sb.append(i+" ");
			}
		}
		System.out.println(sb);
		
	}

	private static void dfs(int now) {
		vis[now]= true;
		for(int i : arr[now]) {
			if(!vis[i]) {
				ans[i]++;
				dfs(i);
			}
		}				
		
	}

}
