//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringChecker
{
	private String word;

	public StringChecker()
	{
		
				
	}

	public StringChecker(String s)
	{

		
	}

   public void setString(String s)
   {
	   word=s;

	   
   }

	public boolean findLetter(char c)
	{
		int index;
		String s = word;
		index = s.indexOf('c');
		if (index >=0)
			return true;		
		else
			return false;
	}

	public boolean findSubString(String s)
	{
		int index;
		String find = word;
		index = find.indexOf(s);
		if (index >=0)
			return true;		
		else
			return false;
	}

 	public String toString()
 	{
 		return "\n\n";
	}
}