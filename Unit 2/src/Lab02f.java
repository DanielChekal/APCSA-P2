import java.util.Scanner;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Lab02f
{
	public static void main( String[] args )
   {
		//add test cases
		
		Scanner r = new Scanner(System.in);
		Line test = new Line();
		
		System.out.println("Enter y2: ");
		double yTwo = r.nextDouble();
		System.out.println("Enter y1: ");
		double yOne = r.nextDouble();
		System.out.println("Enter x2: ");
		double xTwo = r.nextDouble();
		System.out.println("Enter x1: ");
		double xOne = r.nextDouble();
		double slope = ((double)yTwo - (double)yOne)/((double)xTwo - (double)xOne);
		test.print(slope);
		
	}
}