package java_oop_0327;

public class Exam다형성2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d1 = new D();
		System.out.println(d1 instanceof A);//T
		System.out.println(d1 instanceof B);//T
		//System.out.println(d1 instanceof C);//F
	}

}
class A{}
class B extends A{}
class C extends A{}
class D extends B{}
