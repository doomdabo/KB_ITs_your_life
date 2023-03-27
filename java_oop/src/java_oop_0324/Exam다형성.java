package java_oop_0324;

public class Exam다형성 {

	public static void main(String[] args) {
		//부모타입 변수 = new 자식타입1()
		//부모타입 변수 = new 자식타입2()
		MyShape ms1 = new MyLine(1,1,2,2);
		MyLine ml1 = (MyLine)ms1; //명시적 형변환 해줘야 함
	}

}
