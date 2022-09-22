package movie;

public class NewRelease extends Movie {

	public NewRelease(String title, int priceCode) {
		super(title, priceCode);
		
	}

	@Override
	public double getCharge(int daysRented) {
		
		return daysRented*3;
	}

}
