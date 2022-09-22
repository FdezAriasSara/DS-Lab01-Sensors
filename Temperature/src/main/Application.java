package main;
import temperatures.Temperature;
public class Application 
{
	//This is supposed to be client code, we should change as little as possible
	// Extracting these operations is an structural enhancement, not a design enhancement
	public static void main(String[] args) 
	{
		Temperature[] temperaturas = new Temperature[100];

		// Toma de datos
		for (int i = 0; i < temperaturas.length; i++)
			temperaturas[i] = leeSensorCelsius();

		// Cálculo con los datos en Celsius
		double mediaCelsius = 0;
		for (int i = 0; i < temperaturas.length; i++)
			mediaCelsius += temperaturas[i].getCelsius();
		mediaCelsius = mediaCelsius / temperaturas.length;
		System.out.printf("La media en Celsius es: %.1f ºC\n", mediaCelsius);

		// Cálculo con los datos en Fahrenheit
		double mediaFahrenheit = 0;
		for (int i = 0; i < temperaturas.length; i++)
			mediaFahrenheit += temperaturas[i].getFahrenheit();
		mediaFahrenheit = mediaFahrenheit / temperaturas.length;
		System.out.printf("La media en Fahrenheit es: %.1f ºF\n", mediaFahrenheit);

		// Otro cálculo con los datos en Fahrenheit
		double varianza = 0;
		for (int i = 0; i < temperaturas.length; i++)
			varianza += Math.pow((temperaturas[i].getFahrenheit()) - mediaFahrenheit, 2);
		varianza = varianza / temperaturas.length;
		System.out.printf("La varianza en Fahrenheit es: %.1f\n", varianza);
	}

	public static Temperature leeSensorCelsius() 
	{
		return new Temperature(Math.random() * 30);
	}
}