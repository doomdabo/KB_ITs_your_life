package java0308_3;

import java.util.ArrayList;

public class ExamSort2 {

	public static void main(String[] args) {
		// 내가 만든 클래스 정렬
		// 1. 클래스가 Comparable 인터페이스 구현
		// 2. Comparator 구현체 생성
		ArrayList<Person> pa = new ArrayList<>();
		pa.add(new Person("홍", 30));
		pa.add(new Person("김", 32));
		pa.add(new Person("박", 35));
	}

}

class Person implements Comparable<Person>{

	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}


	@Override
	public String toString() {
		return "name=" + name + ", age=" + age;
	}

	@Override
	public int compareTo(Person o) {
	
		return this.age - o.getAge();
	}


}
