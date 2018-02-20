//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab08g
{
	public static void main ( String[] args )
	{
		
			
		for (int i = 0; i < 3; i++)
		{		
		LoopStats Run = new LoopStats();
		System.out.println(Run.toString());
		System.out.println("Total :: " + Run.getTotal());
		System.out.println("Even Count :: " + Run.getEvenCount());
		System.out.println("Odd Count :: "+ Run.getOddCount());
		System.out.println();
		}
		
					
	}
}
