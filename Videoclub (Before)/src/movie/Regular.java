package movie;

public class Regular extends Movie {

	private static final int THRESHOLD = 2;
	private static final int BASE_CHARGE = 2;

	public Regular(String title, int priceCode) {
		super(title, priceCode);
		
	}

	@Override
	public double getCharge(int daysRented) {
		double charge = BASE_CHARGE;
		if (daysRented > THRESHOLD)
			charge += (daysRented - 2) * 1.5;
		return charge;
	}

}
