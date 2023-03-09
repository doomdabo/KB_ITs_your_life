package java0303;

public class Quiz0303 {
	public static void main(String[] args) {
		/*1*/
		//int n = 17/4+3.5;
		//System.out.println(n);  -> 오류..  double 을 int로 자동형변환 불가
		//Type mismatch: cannot convert from double to int
		
		/*2*/
		int sum =0;
		for(int i=1;i<=10;i++) {
			if(i%2==0) sum+=i;
		}
		System.out.println(sum);
		
		/*3*/
		
		int jumsu = 100;
		switch(jumsu/10) {
			case 10:
			case 9: System.out.print("A");
			case 8: System.out.print("B");
			case 7: System.out.print("C");
			default: System.out.print("F");
		}
		//결과로 ABCF 나옴
	}
}
