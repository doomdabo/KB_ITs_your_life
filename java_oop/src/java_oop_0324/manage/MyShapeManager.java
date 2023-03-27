package java_oop_0324.manage;

import java.util.ArrayList;

import java_oop_0324.vo.MyCircle;
import java_oop_0324.vo.MyLine;
import java_oop_0324.vo.MyRect;
import java_oop_0324.vo.MyShape;

public class MyShapeManager {

	private ArrayList<MyShape> arr = new ArrayList<>();

	public void add(MyLine ml1) {
		arr.add(ml1);
	}
	public void add(MyRect ml1) {
		arr.add(ml1);
	}
	public int getCount() {
		return arr.size();
	}
	public void add(MyCircle mc1) {
		arr.add(mc1);		
	}
	public void printAll() {
		System.out.println("**전체 출력**");
		for(MyShape myShape : arr) 
			System.out.println(myShape.toString());
		
	}

	public MyShape findByPosition(int x1,int y1) throws ShapeNotFoundException {
		for(MyShape myShape : arr) {
			if(myShape.getX1()==x1&&myShape.getY1()==y1)
				return myShape;
		} //return null;
		throw new ShapeNotFoundException(x1,y1);//사용자 정의 예외는 중급레벨
	}
	/*해당 좌표에 도형이 없으면 ShapeNotFoundException 발생*/
	public ArrayList<MyShape> findByPosition2(int x1,int y1)  {
		ArrayList<MyShape> arr = new ArrayList<>();
		for(MyShape myShape : arr) {
			if(myShape.getX1()==x1&&myShape.getY1()==y1) {
				arr.add(myShape);
			}
		} return arr;
}
	public void drawAll() {
		System.out.println("**전체 출력**");
		for(MyShape myShape : arr) 
			System.out.println(myShape.draw());
		
	}
}
