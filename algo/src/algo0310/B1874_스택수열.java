package algo0310;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class B1874_스택수열 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		//declare 
		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		int max = 0;
		Stack<Integer> s = new Stack<>();
		int x;
		
		while((n--)!=0) {
			x = Integer.parseInt(br.readLine());
			if(x>max) {
				for(int i=max+1;i<=x;i++) {
					s.push(i);//4들어온 경우 1,2,3,4 push
					sb.append("+").append("\n"); //4번 + 출력
				}
				s.pop();//4 내보냄
				sb.append("-").append("\n"); //4 뺐으니까 - 출력
				//스택에 1,2,3 남음 
				max = x; //젤큰게 x로 갱신
			}
			else { //x<=max인 경우
				if(s.peek()!=x) { //이런 경우는 해결할 수 없음 
					//현재 스택의 맨 위에있는 값이 아니라 그 아래에 있는 값을 의미
					sb = new StringBuilder("NO");
					break;
				}
				s.pop();//바로 내보내고				
				sb.append("-").append("\n"); 

			}
		}
		System.out.println(sb);
		
	}

}
