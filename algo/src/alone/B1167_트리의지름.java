package alone;

import java.io.*;
import java.util.*;

//https://moonsbeen.tistory.com/101 :설명 굳
public class B1167_트리의지름 {
	static int v;
	static boolean[] vis;
	static int[] dist;
	static ArrayList<Edge>[] arr;
		
	public static void main (String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int v = Integer.parseInt(st.nextToken());
		vis = new boolean[v+1];
		dist = new int[v+1];
		arr = new ArrayList[v+1];
		for(int i = 1;i<=v;i++) 
			arr[i] = new ArrayList<Edge>();
		//입력받은거 저장
		for(int i =0 ; i<v;i++) {
			st = new StringTokenizer(br.readLine());
			int ver = Integer.parseInt(st.nextToken());
			while(true) {
				int e = Integer.parseInt(st.nextToken());
				if(e == -1) break;
				int value = Integer.parseInt(st.nextToken());
				arr[ver].add(new Edge(e,value));
			}
		}
		bfs(1);
		int max_idx = 1;
		for(int i = 2;i<v+1;i++) {
			if(dist[max_idx]<dist[i])
				max_idx = i;
		}
		vis = new boolean[v+1];
		dist = new int[v+1];
		bfs(max_idx);
		Arrays.sort(dist);
		System.out.println(dist[v]);
	}

	private static void bfs(int i) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(i);
		vis[i] = true;
		while(!q.isEmpty()) {
			int cur = q.poll();
			for(Edge temp:arr[cur]) {
				if(!vis[temp.e]) {
					vis[temp.e] = true;
					q.add(temp.e);
					dist[temp.e] = dist[cur]+temp.dis;
				}
			}
		}
	}


}

class Edge{
	int e;
	int dis;
	public Edge(int e, int dis) {
		this.e = e;
		this.dis = dis;
	}
}
