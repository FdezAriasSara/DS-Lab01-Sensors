import movie.Movie;

/**
 * Esta clase representa el alquiler de una película por parte de un cliente.
 */
public class Rental {
	private Movie movie;
	private int daysRented;

	public Rental(Movie movie, int daysRented) {
		this.movie = movie;
		this.daysRented = daysRented;
	}

	public int getDaysRented() {
		return daysRented;
	}

	public Movie getMovie() {
		return movie;
	}

	public double getAmount() {
		double totalAmount = 0;

		// Calcula el importe de cada alquiler
		switch (getMovie().getPriceCode()) {
		case Movie.REGULAR:
			totalAmount += 2;
			if (getDaysRented() > 2)
				totalAmount += (getDaysRented() - 2) * 1.5;
			break;
		case Movie.NEW_RELEASE:
			totalAmount += getDaysRented() * 3;
			break;
		case Movie.CHILDRENS:
			totalAmount += 1.5;
			if (getDaysRented() > 3)
				totalAmount += (getDaysRented() - 3) * 1.5;
			break;

		}
		return totalAmount;
	}
}
