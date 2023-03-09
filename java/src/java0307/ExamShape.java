package java0307;

public class ExamShape {

	public static void main(String[] args) {

		Shape[] sarr = new Shape[3];
		sarr[0] = new Line(1, 1, 3, 3);
		sarr[1] = new Circle(2, 2, 5);
		Shape l = new Line(1, 1, 3, 3);
		l.draw();// 실제 객체의 override한 메서드가 실행된다.

	
	}

}
