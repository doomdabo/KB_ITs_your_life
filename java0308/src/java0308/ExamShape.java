package java0308;

public class ExamShape {

	public static void main(String[] args) {
		/**
		 * 자바로 그림판 작성
		 * 만든 도형정보 저장*/
		Shape l1 = new Line(1,1,3,3 );//부모 타입 변수에 자식 타입 객체 저장 가능 - 다형성
	System.out.println(l1);
	l1 = new Circle(2,2,5);
	}
}
