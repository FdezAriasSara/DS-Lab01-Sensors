import java.util.List;

import movie.Movie;

import java.util.ArrayList;

public class Customer 
{
	private String name;
	private List<Rental> rentals = new ArrayList<Rental>();
	
	public Customer(String name) 
	{
		this.name = name;
	}
	
	public void addRental(Rental rental) 
	{
		rentals.add(rental);
	}
	
	public String getName() 
	{
		return name;
	}
	
	public String statement() 
	{
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		String result = "Rental Record for " + getName() + "\n";
		
		for (Rental each : rentals) {
			double thisAmount=each.getAmount();
			// Añade los puntos de alquiler frecuente
			frequentRenterPoints++;
			// Un punto extra en el caso de las novedades alquiladas por un período de dos o más días
			if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDaysRented() > 1) 
			frequentRenterPoints++;
				
			// Muestra el importe de esta película alquilada
			result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
			totalAmount += thisAmount;
			}
			
			
		
		
		// Añade las líneas de total
		result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
		result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
		
		return result;
	}
}
