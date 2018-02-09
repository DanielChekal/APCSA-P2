import java.util.Scanner;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Line
{
	private int xOne,yOne, xTwo, yTwo;
	private double slope;

	public Line(int x1, int y1, int x2, int y2)
	{
		Scanner r = new Scanner(System.in);
		System.out.print("Enter the x1 value :: ");
		int num1 = r.nextInt();
		System.out.print("Enter the x2 value :: ");
		int num2 = r.nextInt();
		System.out.print("Enter the y1 value :: ");
		int num3 = r.nextInt();
		System.out.print("Enter the y2 value :: ");
		int num4 = r.nextInt();
		double slope = (num4-num3)/(num2-num1);
		System.out.println("The slope is :: " + slope );


	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{





	}

	public void calculateSlope( )
	{



	}

	public void print( )
	{



	}
}