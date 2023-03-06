package java01;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello java");
		/*
		 * 단축어
		 * 줄삭제: ctrl+d
		 * sysout ctrl+space
		 * 실행 단축어: ctrl+f11
		 * 디버깅: f11
		 * 줄복사: ctrl+ALT+위아래 화살표
		 * 줄이동: alt+위아래
		 * 한단어씩이동: ctrl + 좌우 화살표
		 * 한단어씩선택: ctrl + shift + 좌우
		 * */
		
		char c1 = '가';
		System.out.println(c1);
		/*형변환*/
		System.out.println((int)c1); //44032
		System.out.println(c1+1); //44033
		System.out.println((char)(c1+1)); //각
		System.out.println((char)(c1+2)); //갂
		System.out.println((char)(c1+3)); //갃
		
		//class는 객체의 template, object는 클래스의 instance
		
		
		
	}
}
