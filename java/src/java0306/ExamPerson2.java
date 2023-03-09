package java0306;

public class ExamPerson2 {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 30);
		p1.printInfo();
		Person p2 = new Person(30, "홍길동");
		p2.printInfo();
		System.out.println(p1);
		System.out.println(p2);
	}
}
