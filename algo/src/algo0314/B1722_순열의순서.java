package algo0314;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1722_순열의순서 {

	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		/* 변수 선언 및 초기화 */
		int n, q; // q는 문제 번호
		long f[] = new long[21]; // 팩토리얼 경우의 수 계산. 20! 까지 가능하므로 int 형이 아닌 long형으로 선언해야함.
		int s[] = new int[21];
		boolean visited[] = new boolean[21];

		/* 사용자한테 값 입력받기 */
		n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());// 두번째 줄 입력 받기
		q = Integer.parseInt(st.nextToken()); // 1번 문제인지, 2번 문제인지 판단

		/* 팩토리얼 계산해서 미리 저장. 각 자리별 순열의 경우의 수를 뜻함 */
		f[0] = 1; // 팩토리얼 첫번째 수에 1 저장
		for (int i = 1; i <= n; i++) {
			f[i] = f[i - 1] * i;
		}

		/* q == 1 인 경우 -> k번째 수열 출력 */
		if (q == 1) {
			long k = Long.parseLong(st.nextToken());
			for (int i = 1; i <= n; i++) {
				for (int j = 1, cnt = 1; j <= n; j++) {
					if (visited[j])
						continue; // 이미 사용한 숫자는 사용할 수 없으므로 넘김
					if (k <= cnt * f[n - i]) { // 주어진 k에 따라서 각 자리에 들어갈 수 있는 수 찾기
						// 얘를 들어 n=4, k=10 이라면 맨 처음에는 10<=1*f[3]을 계산한다.
						// 즉, 10<=2*f[3] 일때 해당 식이 성립하므로, 2번째 그룹(후보1,2,3,4 중 2에 해당)에 맨 첫번째 숫자가 존재한다.
						// 2로 시작하는 순열 중, 10-1*6=4번째에 해당 순열이 존재한다.
						k -= (cnt - 1) * f[n - i]; // 따라서 k를 새로 갱신해준다.
						s[i] = j; // 그리고 배열 s에 2를 저장해준다.
						visited[j] = true;// 2는 더이상 사용할 수 없으므로 방문 표시를 해준다.
						break;
					}
					cnt++;
				}
			}
			for (int i = 1; i <= n; i++) {
				System.out.print(s[i] + " ");
			}
		} else { // q==2인 경우
			long k = 1;
			for (int i = 1; i <= n; i++) {
				s[i] = Integer.parseInt(st.nextToken());
				long cnt = 0;
				for (int j = 1; j < s[i]; j++) {
					if (!visited[j]) {
						cnt++;// 사용 안한 숫자 개수만큼 카운트
					}
				}
				k += cnt * f[n - i];
				visited[s[i]] = true;
			}
			System.out.println(k);
		}

	}
}

/*
 순열의 순서 구하기
K번째 순열 구하는 계산방법
n=4, 10번째 순열을 구하라
k=10

k < 6 이면 첫번째숫자는 1
7 <= k <= 12 이면 첫번째숫자는 2
그래서 첫번째숫자는 2xxx  남은 숫자   1 3 4

k - 6 = 4, k=4
k <=2 두번째숫자는 1
3  <= k <= 4  두번째숫자는 2, 그래서 두번째숫자는 남은 숫자의 2번째 3
   남은 숫자 1 4

k = 4 - 2 = 2
k = 1 이면 세번째숫자는 남은 숫자중 1번째
k = 2 이면 세번째숫자는 남은 숫자중 2번째
그래서 세번째숫자는 남은 숫자중 2번째인 4, 남은 숫자는 1
결론. 10번째 순열의 숫자는 2 3 4 1

-----------------------------------
순열로 순열 번호를 구하는 계산 방법
순열 3,2,4,1은 몇번째 순열인가?
List : 1,2,3,4
Now: ?,?,?,?
Target: 3 2 4 1

첫번째가 1 - 순번은 1~6 - 6
첫번째가 2 - 순번은 7~12 - 6
첫번째가 3 - 순번은 13~18 - 6

순번은 12보다 크다.  순번 = 12
Now: 3,x x x
두번째숫자 2, 남은 숫자중 몇번째?  1 2 4 . 2 번째 그룹. 남은 숫자  1 4
순번에 2를 더함. 순번 += 2 -> 14

3번째 숫자의 경우의 수는 1  순번 += 1  15

4번째 숫자 +1  16

-------------------------------------
순열 1 3 2 4 는 몇번째 순열인가?
List: 1,2,3,4
Now: xxxx
Target: 1 3 2 4

첫번째가 1, 순번은 (숫자그룹번호:1-1)*6 = 0
Now: 1xxx (2,3,4)

두번째 숫자는 3, 남은 숫자중 2번째 순번 += 2 : 2
Now: 1 3 (2 4)

세번째숫자는 2, 남은 숫자중 1번째 순번 += 0 : 2

네번째 순번 += 1 2+1 = 3
 * */
 