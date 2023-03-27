package workshop2_0327;

public class Rental {
	//겹치는 것: 관리번호, 제목, 대여료, 대여상태
	private int num;
	private String title;
	private int rentfee;
	private String state;
	
	
	public Rental(int num, String title, int rentfee, String state) {
		this.num = num;
		this.title = title;
		this.rentfee = rentfee;
		this.state = state;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getRentfee() {
		return rentfee;
	}
	public void setRentfee(int rentfee) {
		this.rentfee = rentfee;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Rental [num=" + num + ", title=" + title + ", rentfee=" + rentfee + ", state=" + state + "]";
	}
	
	
}
