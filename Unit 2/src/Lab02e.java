//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import java.util.Scanner;
public class Lab02e
{
	public static void main( String[] args )
   {
		//add test cases
		int x = 0;
	while (x<7)
	{
		Scanner r = new Scanner(System.in);
		System.out.println("Enter a radius: ");
		double num = r.nextDouble();
		double area = num*num*3.14;
		System.out.println("The area is :: "+ area);
		x = x+1;
	}
		
		
	}
}