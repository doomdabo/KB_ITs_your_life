package java0307;

public class Circle extends Shape {

	private int rad;

	public Circle(int x1, int y1, int rad) {
		super(x1, y1);
		this.rad = rad;
	}

	public int getRad() {
		return rad;
	}

	public void setRad(int rad) {
		this.rad = rad;
	}

	@Override
	public String toString() {
		return super.toString() + "Circle [rad=" + rad + "]";
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("원그리기"); 
	}

}
