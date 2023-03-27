package workshop2_0327;

public class Video extends Rental{
	private String production;
	private int showtimes;
	
	public Video(int num, String title, int rentfee, String state, String production, int showtimes) {
		super(num, title, rentfee, state);
		this.production = production;
		this.showtimes = showtimes;
	}
	public String getProduction() {
		return production;
	}
	public void setProduction(String production) {
		this.production = production;
	}
	public int getShowtimes() {
		return showtimes;
	}
	public void setShowtimes(int showtimes) {
		this.showtimes = showtimes;
	}

	
	
	
}
