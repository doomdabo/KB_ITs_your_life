package java0302;

public class ExamArr2 {
	public static void main(String[] args) {
		int[] points = {100,200,300}; //변수 선언할 때만 사용 가능
		int[] points2 = new int[]{100,200,300}; // 객체 생성 - 선언과 재할당시 언제나 가능`
		//points = {300,400,500}; ==> 오류. 배열 상수는 초기화할때만 사용 가능
		//points = new int[]{300,400,500} 은 가능
	}
}
