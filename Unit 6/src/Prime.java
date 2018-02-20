//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import static java.lang.Math.*;

import java.lang.Math;
import java.util.Scanner;

public class Prime
{
	private int number;
	
	public Prime()
	{
		Scanner Word = new Scanner(System.in);
		System.out.print("Give me a number :: ");
		number = Word.nextInt();
		
	}

	public Prime(int num)
	{


	}

	public void setPrime(int num)
	{
		

	}

	public boolean isPrime()
	{
		return false;
	}

	public String toString()
	{
		String output = "";
		for (int i = 2; i<sqrt(number)+1; i++)
		{
			if (number == 2)
			{
				output = number + " is prime.";
				break;
			}
			if (number%i == 0)
			{
				output = number + " is not prime.";
				break;
			}
			else;
			{
				output = number + " is prime.";
			}
		}
		
		return output;
	}
}
