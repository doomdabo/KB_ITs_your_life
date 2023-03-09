package java0307;

public class ExamPerson {

	public static void main(String[] args) {

		Person[] pa = new Person[5];
		System.out.println(pa[0]);
		pa[0] = new Person("홍",30);
		pa[1] = new Person("김",32);
	}

}
