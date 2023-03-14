package algo0310;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class B2493_탑 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken());
		Stack<Integer> s = new Stack<>();
		//get the height of 
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i<n;i++) {
			int temp = Integer.parseInt(st.nextToken());
			s.push(temp);
		}
		
	}
	class Pair{
		Integer x,y;
		public Pair(Integer y, Integer x) {
			this.y = y;
			this.x = x;
		}
		public Integer first() {
			return y;
		}
		public Integer second() {
			return x;
		}
	}

}
