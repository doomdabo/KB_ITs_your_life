package java_oop_0324_workshop;

public class Elec {
	private int price,birth; //가격, 출시년도
	
	public Elec(int price, int birth) {
		this.price = price;
		this.birth = birth;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getBirth() {
		return birth;
	}

	public void setBirth(int birth) {
		this.birth = birth;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "가격:" +price+", 출시년도:" +birth;
	}
}
