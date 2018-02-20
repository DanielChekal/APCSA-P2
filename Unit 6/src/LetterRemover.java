//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;


public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		Scanner test = new Scanner(System.in);
		System.out.print("Give me a sentence :: ");
		String s = test.nextLine();
		System.out.print("What letter should I remove? ");
		char c = test.next().charAt(0);
	}
	
	public LetterRemover(String s, char rem)
	{
		setRemover(s,rem);
	}

	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned=sentence;

		for (int i=0; i<cleaned.length(); i++)
		{
			if (cleaned.charAt(i) == lookFor)
			{
				cleaned = cleaned.substring(0, i) + cleaned.substring(i,cleaned.length());		
			}
		}

		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + "\n" + removeLetters();
	}
}
