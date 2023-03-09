package java0307;

abstract public class Shape {
	int x1, y1;

	public Shape(int x1, int y1) {
		this.x1 = x1;
		this.y1 = y1;
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
		return "Shape [x1=" + x1 + ", y1=" + y1 + "]";
	}

	abstract public void draw(); // 추상 메소드라고 부름 
	
}
