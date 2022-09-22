package movie;

public class Childrens extends Movie {
	private static final int THRESHOLD = 3;
	private static double BASE_CHARGE=1.5;
	public Childrens(String title, int priceCode) {
		super(title, priceCode);
		
	}

	@Override
	public double getCharge(int daysRented) {
		double charge =BASE_CHARGE;
		if (daysRented > THRESHOLD)
			charge += (daysRented- 3) * 1.5;
		return charge;

	}

}
