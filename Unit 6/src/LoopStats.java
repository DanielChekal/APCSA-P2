//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class LoopStats
{
	private int start, stop;

	public LoopStats()
	{
		Scanner test = new Scanner(System.in);
		System.out.print("First Number :: ");
		start = test.nextInt();
		System.out.print("Final Number :: ");
		stop = test.nextInt();

	}

	public LoopStats(int beg, int end)
	{
		

	}

	public void setNums(int beg, int end)
	{
 

	}

	public int getEvenCount()
	{
		int evenCount=0;
		
		for (int i = start; i<stop+1; i++)
		{
			if (i % 2 == 0){
				evenCount ++;
			}
		}

		return evenCount;
	}

	public int getOddCount()
	{
		int oddCount=0;

		for (int i = start; i<stop+1; i++)
		{
			if (i % 2 == 1){
				oddCount ++;
			}
		}



		return oddCount;
	}

	public int getTotal()
	{
		int total=0;

		for (int i = start; i<stop+1; i++)
		{
			total = total + i;
		}


		return total;
	}
	
	public String toString()
	{
		return start + " " + stop;
	}
}