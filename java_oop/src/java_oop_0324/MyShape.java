package java_oop_0324;

public class MyShape {
	private int x1;
	private int y1;
	
	public MyShape() {
		// TODO Auto-generated constructor stub
	}
	public MyShape(int x1, int y1) {
		this.x1=x1;
		this.y1=y1;
	}
	public int getX1() {
		return x1;
	}
	public void setX1(int x1) {
		this.x1 = x1;
	}
	public int getY1() {
		return y1;
	}
	public void setY1(int y1) {
		this.y1 = y1;
	}
	@Override
	public String toString() {
		return "x1=" + x1 + ", y1=" + y1;
	}
	
}
