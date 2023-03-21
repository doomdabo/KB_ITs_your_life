package algo0320;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1717_집합의표현 {
	public static int[] parent;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		parent = new int[n + 1];
		// 대표 노드 자기 자신으로 초기화
		for (int i = 0; i <= n; i++)
			parent[i] = i;
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int question = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(question == 0) union(a,b);
			else {		
				if(checkSame(a,b)) sb.append("YES").append("\n");
				else sb.append("NO").append("\n");
			}
			
		}
		System.out.println(sb);
	}

	private static boolean checkSame(int a, int b) {
		//두 원소가 같은 집합인지 확인하기
		a = find(a);
		b = find(b);
		return a==b;
	}

	private static void union(int a, int b) {
		//union 연산: 대표 노드까지 연결하기
		a = find(a);
		b = find(b);
		if(a!=b) {
			parent[b] = a;
		}
	}

	private static int find(int a) {
		//재귀 함수의 형태로 구현 -> 경로 압축 부분
		if(a == parent[a])
			return a;
		else return parent[a] = find(parent[a]);
	}

}
