package java_oop_0324;

public class Exam그림판 {

	public static void main(String[] args) {
		/*사용자가 그린 도형을 관리
		사용자가 만들 도형:선, 사각, 원
		선(MyLine):두 점을 직선으로 잇는 도형. x1, y1, x2, y2
	    사각(MyRect): x1, y1, width, height
	    원(MyCircle): x1,y1,radius
		공통 변수를 부모 클래스로 정의: Shape
		*/
		MyShape ms1 = new MyShape(3,5);
		MyLine ml1 = new MyLine(3,3,5,5);
		MyRect mp1 = new MyRect(3,5,5,15);
		MyCircle mc1 = new MyCircle(3,3,5);
		
	}

}
