package java0307;

public class Student extends Person{
	
	private String jeongong;

	public Student(String name, int age, String jeongong) {
		super(name,age); //부모 클래스의 기본 생성자 메소드 호출 
		this.jeongong = jeongong;
	}

	@Override
	public String toString() {
		return super.toString()+", jeongong = "+jeongong;
	}
	

}
