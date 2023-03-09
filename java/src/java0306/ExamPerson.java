package java0306;

public class ExamPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		
		p.setAge(30);
		p.setName("홍길동");
		System.out.println(p.getName() + "의 나이는 " + p.getAge()); // 모두 같은 결과가 나온다. p.toString() == p
		System.out.println(p); 
		System.out.println(p.toString());
		/*
		 * 클래스 멤버 변수, 인스턴스 멤버 변수 구분하기 클래스 멤버 변수 : static 키워드 사용. 클래스를 통해 접근 클래스 영역에 클래스
		 * 로딩되는 시점에 메모리에 생성 프로그램 종료시 삭제
		 * 
		 * 인스턴스 멤버 변수 : static 키워드 사용 X. 객체를 통해 접근 배열처럼 자동 초기화. 힙 공간에 만들어짐. 객체 생성 시 생성.
		 * 객체별로 생성 가능 객체가 없어지는 가비지 컬렉션이 일어나는 시점에 삭제
		 **/
		Person p2 = new Person();
		System.out.println(p2.getName()); // null 출력
		p2.setName("김길동");
		p2.setAge(32);
		System.out.println(p2.getName() + "의 나이는 " + p2.getAge());
		//p2.printInfo();

		// Person p3; //선언 및 초기화 필요
		// System.out.println(p3.name); //초기화 안됨 오류

	}

}
