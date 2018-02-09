//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import java.util.Scanner;
public class Fahrenheit
{
	private double fahrenheit;

	public void setFahrenheit(double fahren)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("What is the temperature in degrees Fahrenheit?");
		fahrenheit = s.nextDouble();
	}

	public double getCelsius()
	{
		double celsius = 0.0;
		celsius = (fahrenheit-32)*5/9;
		return celsius;
	}

	public void print()
	{
		//this is part of the solution
		System.out.print(fahrenheit + " degrees Fahrenheit == ") ;
		System.out.print(getCelsius());
		System.out.println(" degrees Celsius");
	}
}