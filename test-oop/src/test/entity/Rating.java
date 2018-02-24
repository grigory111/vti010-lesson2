package test.entity;

public class Rating {
	protected String PredmetName;
	protected int Rating;
	public Rating(String predmetName, int rating) {
		super();
		PredmetName = predmetName;
		Rating = rating;
	}
	public String getPredmetName() {
		return PredmetName;
	}
	public void setPredmetName(String predmetName) {
		PredmetName = predmetName;
	}
	public int getRating() {
		return Rating;
	}
	public void setRating(int rating) {
		Rating = rating;
	}
	
}
