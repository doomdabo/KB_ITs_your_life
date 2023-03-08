package java0308_2;

public class ExamClassMemberVariable {
	public static void main(String[] args) {
		AA.j = 300;
		AA a1 = new AA();
		a1.i = 100;
		a1.j = 100; // 비추천 사용법 클래스 멤버 변수는 클래스 이름으로 접근하는 것이 좋다
		AA a2 = new AA();
		a2.i = 200;
		System.out.println(AA.j);

	}
}

class AA {
	int i; // 인스턴스 변수 -> 인스턴스를 만든 후 사용 가능
	static int j; // 클래스 멤버변수 - 클래스 영역에 딱 하나 만들어짐. 클래스 영역에 공유
	
	void prn() {
		System.out.println(i + ", "+j);
	}
	static void prn2() {
		//System.out.println(i+", "+j);//Cannot make a static reference to the non-static field i
		AA a1 = new AA();//객체 생성해야 i호출 가능
		System.out.println(a1.i+", "+j);
		//static method는 대부분 혼자 일 처리하는게 대부분 
		System.out.println("prn2().....");
		
	}
}

/*
 * AA.java 작성
 * javac AA.java 컴파일 -> AA.class (바이트 코드)
 * 
 * */
