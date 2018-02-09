//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;

import static java.lang.System.*;
import static java.lang.Math.*;
import static java.lang.Math.sqrt;
public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;

	public Quadratic()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a :: ");
		a = s.nextInt();
		System.out.print("Enter b :: ");
		b = s.nextInt();
		System.out.print("Enter c :: ");
		c = s.nextInt();
		
		
	}

	public Quadratic(int quadA, int quadB, int quadC)
	{

	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		
 	}

	public void calcRoots( )
	{
		rootOne = (-b+(Math.sqrt((b*b)-4*a*c)))/(2*a);
		rootTwo = (-b-(Math.sqrt((b*b)-4*a*c)))/(2*a);
			}

	public void print( )
	{
		System.out.println();
		System.out.println("rootone :: "+rootOne);
		System.out.println("roottwo :: "+rootTwo);
		
	}
}