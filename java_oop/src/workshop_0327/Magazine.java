package workshop_0327;

public class Magazine extends Book{
	private String period;
	private int num;

	public Magazine(String isbn, String title, int price, String publisher,String period, int num) {
		super(isbn, title, price, publisher);
		this.period = period;
		this.num = num;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", period: "+period+", num: "+num;
	}

}
