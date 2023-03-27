package java_oop_0324_workshop;

public class AirConditioner extends Elec {
	private int height, width;

	public AirConditioner(int price, int birth, int height, int width) {
		super(price, birth);
		this.height = height;
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", height:" + height + ", width:" + width;
	}

}
