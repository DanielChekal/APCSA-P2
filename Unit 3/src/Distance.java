//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;
import static java.lang.Math.sqrt;
public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter X1 :: ");
		xOne = s.nextInt();
		System.out.print("Enter X2 :: ");
		xTwo = s.nextInt();
		System.out.print("Enter Y1 :: ");
		yOne = s.nextInt();
		System.out.print("Enter Y2 :: ");
		yTwo = s.nextInt();		
		
	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		
		
		
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		
		
		
	}

	public void calcDistance()
	{
		
		distance = Math.sqrt((xTwo-xOne)*(xTwo-xOne)+(yTwo-yOne)*(yTwo-yOne));
		
	}

	public void print( )
	{
		
		System.out.println("Distance == "+distance);
		
	}
}