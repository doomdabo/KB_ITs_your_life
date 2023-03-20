package algo0317;

import java.util.Arrays;
import java.util.Comparator;

public class ExamComparable {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Meeting[] ma = new Meeting[3];
		ma[0] = new Meeting(1, 4);
		ma[1] = new Meeting(3, 6);
		ma[2] = new Meeting(0, 3);
		System.out.println(Arrays.toString(ma));
		Arrays.sort(ma);
		System.out.println(Arrays.toString(ma));

		// 사용자 정의 정렬기 : Interface
		Comparator<Meeting> ct = new StartTimeComparator();
		Arrays.sort(ma, ct); // 시작 시간 기준으로 정렬
		System.out.println(Arrays.toString(ma));

		/**재정의 예시**/
		A a1 = new B();
		a1 = new A() {
			int prn() {
				return 200;// 재 정 의
			}
		};
		System.out.println(a1.prn());
		System.out.println("클래스명은 " + a1.getClass().getName()); //algo0317.ExamComparable$1
		//임의의 클래스명 첫번째 것의 의미로 $1이 출력된다.
		
		/***************************************************/
		
		ct = new Comparator<Meeting>() { //중괄호는 클래스를 의미. 이름은 자바가 내부적으로 붙혀줌.

			@Override
			public int compare(Meeting o1, Meeting o2) {
				return o1.start - o2.start;
			}
			
		};
	}
}

//클래스 안만들고 익명으로 만드는 방식이 있다. Anonymous Class
class A {
	int prn() {
		return 1;
	}
}

class B extends A {
	int prn() {
		return 100;
	}
}

class StartTimeComparator implements Comparator<Meeting> {
	@Override
	public int compare(Meeting o1, Meeting o2) {
		return o1.start - o2.start; // 오름차순 정렬
	}

}

//Meeting 클래스
/* 회의 정보 start = 시작 시간, end = 종료 시간 */
class Meeting implements Comparable<Meeting> { // 여기서 <Meeting> 은 비교 대상
	int start, end;

	public Meeting(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public int compareTo(Meeting o) {
		return this.end - o.end;// 종료시간을 기준으로 정렬
		// 양수면 앞에가 더 큰 것을 의미
		// 음수면 뒤에가 더 큰 것을 의미
	}

	@Override
	public String toString() {
		return start + "-" + end;
	}
}