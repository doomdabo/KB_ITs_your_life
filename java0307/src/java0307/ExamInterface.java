package java0307;

public class ExamInterface {

	public static void main(String[] args) {
		SwimStudent s1 = new SwimStudent("김평형", 21, "체육과");
		System.out.println(s1);
		s1.swim();
		Car c1=new Car("소나타 2022","승용");
		
		SwimCar sc1 = new SwimCar ("소나타","승용");
		sc1.swim();
		
		
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
class SwimCar extends Car implements Swimmable{

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
