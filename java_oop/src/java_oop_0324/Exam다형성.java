package java_oop_0324;

import java_oop_0324.vo.MyLine;
import java_oop_0324.vo.MyRect;
import java_oop_0324.vo.MyShape;

public class Exam다형성 {
	public static void main(String[] args) {
		//부모타입 변수 = new 자식타입1() 
		//부모타입 변수 = new 자식타입2() 
		MyShape ms1 = new MyLine(1,1,2,2);
		//////
		//////
		//타입확인
		System.out.println( ms1 instanceof MyRect);
		System.out.println( ms1 instanceof MyLine);
		
		if( ms1 instanceof MyLine) {
			MyLine ml1 = (MyLine)ms1;
			System.out.println( "x2="+ml1.getX2() );
		}
		
//		MyRect ml1 = (MyRect)ms1;
//		int x2 = ml1.getHeight();
//		System.out.println(x2);
		
		MyShape ms2 = new MyLine(1,1,2,2);
		System.out.println( ms2 instanceof MyLine );
		System.out.println( ms2 instanceof MyRect );
		System.out.println( ms2 instanceof MyShape );
		System.out.println( ms2 instanceof Object );
		
		
	}
}





