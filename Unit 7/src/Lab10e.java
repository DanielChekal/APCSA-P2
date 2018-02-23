// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;

public class Lab10e {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		String response = "y";
		do {
			System.out.print("Guessing Game - how many numbers? ");
			int guess = keyboard.nextInt();
			GuessingGame test = new GuessingGame(guess);
			test.playGame();
			System.out.println("Do you want to play again: ");
			response = keyboard.next();
		} while (response.equals("Y") || response.equals("y"));
	}
}