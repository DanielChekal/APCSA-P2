//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.out;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab24b {
	public static void main(String args[]) throws IOException {
		Scanner file = new Scanner(new File("C://Users//chekald3384//Desktop//APCSA-P2//Unit 14//src//lab24b.dat"));
		int size = file.nextInt();
		file.nextLine();
		for (int i = 0; i < size; i++) {
			String word = file.next();
			FancyWord test = new FancyWord(word);
			out.println(test);

		}
	}
}