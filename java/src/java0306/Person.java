package java0306;

/**
 * 사람에 대한 기본 정보 정의용 <br>
 * 이름, 나이
 * 
 * @author student
 * 
 * 
 */

public class Person {
	private String name;
	private int age;

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println(this);
	}

	public Person(int age, String name) {
		this(name,age);
	}

	void printInfo() {
		System.out.println(name + "의 나이는 " + age);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + "의 나이는 " + age;
	}

}
