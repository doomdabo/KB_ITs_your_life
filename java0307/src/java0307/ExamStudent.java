package java0307;

public class ExamStudent {

	public static void main(String[] args) {
		Student st1 = new Student("김", 20, "컴공");
		System.out.println(st1);
		Emp e1 = new Emp("김대리", 32, "영업부");
		System.out.println(e1);
		// 다형성 - 객체의 다형성 , 메서드의 다형성
		Person p = st1;
		//p.변수타입내 멤버까지만 가능
		p.getAge();
		//p.getJeongong은 불가능하다. 
		Person[] pa = new Person[5];
		pa[0]=st1;
		pa[1]=e1;
	}

}
