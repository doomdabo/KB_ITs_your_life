package java0308;

class Employee{
	void work() {
		System.out.println("w1");
	}
}
class PartEmployee extends Employee{
	void work() {
		System.out.println("w2");
	}
}
public class Quiz {

	public static void main(String[] args) {
		Employee a = new PartEmployee();
		a.work();
	}

}
