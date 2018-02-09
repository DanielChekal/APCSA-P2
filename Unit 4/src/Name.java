//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class Name
{
	private String name;
	String F,L;
	public Name()
	{

	}

	public Name(String s)
	{
		//F = s.substring(0,3);
		
	}

   public void setName(String s)
   {	   
   }

	public String getFirst()
	{
		
		Scanner test = new Scanner(System.in);
		System.out.print("Enter First Name :: ");
		F = test.nextLine();
		return F;
		
	}

	public String getLast()
	{
		Scanner test = new Scanner(System.in);
		System.out.print("Enter Last Name :: ");
		L = test.nextLine();
		return L;
	}

 	public String toString()
 	{
 		name = F + " "+L;
 		return name;
	}
}