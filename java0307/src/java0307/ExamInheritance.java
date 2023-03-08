package java0307;

public class ExamInheritance {

	public static void main(String[] args) {
		S s1 = new S("ㅎ", 20, "ㅋㄱ");

		s1.jeongong = "컴공";
		System.out.println(s1);
		P pp = new S();
		pp.hh();
	}

}

class P {
	private String name;
	private int age;

	@Override
	public String toString() {
		return "P [name=" + name + ", age=" + age + "]";
	}

	public P() {
		// TODO Auto-generated constructor stub
	}

	public P(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void hh() {
		System.out.println("dd");
	}

}

class S extends P {
	String jeongong;

	public S() {
		// TODO Auto-generated constructor stub
	}

	public S(String name, int age, String jeongong) {
		super(name, age);
		this.jeongong = jeongong;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + jeongong;
	}

	void hh() {
		System.out.println("dd");
	}

}