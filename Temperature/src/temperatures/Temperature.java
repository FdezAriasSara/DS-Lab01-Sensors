package temperatures;

public class Temperature {
	private double celsius;
	private double fahrenheit;
	public Temperature(double celsius) {
		setDegrees(celsius);
	}
	public void setDegrees(double celsius) {
		this.celsius = celsius;
		this.fahrenheit = celsius * 9 / 5 + 32;
	}

	public double getFahrenheit() {
		return this.fahrenheit;
	}

	public double getCelsius() {
		return this.celsius;
	}
}
