package java0307;

import java.util.Iterator;

public class ExamInterface {

	public static void main(String[] args) {
		//수영학생
		SwimStudent s1 = new SwimStudent("김평형", 21, "체육과");
		System.out.println(s1);
		s1.swim();
		//수영차
		SwimCar sc1 = new SwimCar("소나타", "승용");
		sc1.swim();
		
		//수영하는 것들 다 배열에 저장
		Swimmable[] sarr = new Swimmable[2]; //swimmable에서 정의한 메소드만 접근 가능함
		sarr[0] = s1;
		sarr[1] = sc1; //sarr[1].swim()밖에 호출 못함 
		Car cc = (Car)sarr[1];//강제 형변환
		//cc.model도 이제 접근 가능하다~ 근데 수영못함
		//-> SwimCar타입으로 바꾸면 다할수있다
		SwimCar sc = (SwimCar)sarr[1];
		
		//탐색
		for (int i = 0; i < sarr.length; i++) {
			sarr[i].swim();
		}
		
		Swimmable sw = s1;
		sw.swim();
		sw = sc1;
		sw.swim();
	}
}

	interface Swimmable { // 수영할 수 있는 객체가 가져야하는 타입
		void swim();
	}

	class Car {
		String model, type;// model = 소나타, 제네시스 ... type = 승용, 화물, 버스

		public Car(String model, String type) {
			this.model = model;
			this.type = type;
		}
	}

	class SwimCar extends Car implements Swimmable {

		public SwimCar(String model, String type) {
			super(model, type);
		}

		@Override
		public void swim() {
			System.out.println("프로펠러 ㄱㄱㄱㄱ");

		}

	}

//수영 가능한 학생
class SwimStudent extends Student implements Swimmable {

	public SwimStudent(String name, int age, String jeongong) {
		super(name, age, jeongong);

	}

	@Override
	public void swim() {
		System.out.println("평형");
	}

}
