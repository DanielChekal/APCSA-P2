//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class Lab09f
{
	public static void main( String args[] )
	{
		Scanner test = new Scanner(System.in);
		System.out.print("Give me a sentence :: ");
		String s = test.nextLine();
		System.out.print("What letter should I remove? ");
		char c = test.next().charAt(0);
		
		LetterRemover run = new LetterRemover();
		run.removeLetters();
		run.toString();
		
		
											
	}
}