//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.out;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab21i {
	public static void main(String args[]) throws IOException {
		Maze test;
		Scanner file = new Scanner(new File("C://Users//chekald3384//Desktop//APCSA-P2//Unit 14//src//lab21i.dat"));
		while (file.hasNextLine()) {
			int size = file.nextInt();
			file.nextLine();
			String line = file.nextLine();
			test = new Maze(size, line);
			out.println(test);
		}
	}
}