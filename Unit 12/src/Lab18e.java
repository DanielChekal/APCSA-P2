//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab18e {
	public static void main(String args[]) throws IOException {
		ArrayList<Wordd> words = new ArrayList<>();
		Scanner file = new Scanner(new File("/Users/fireguy/Documents/workspace/Unit 12 Asignments/src/lab18e.dat"));
		int length = file.nextInt();
		file.nextLine();
		for (int i = 0; i < length; i++) {
			words.add(new Wordd(file.nextLine()));
		}
		for (int n = 0; n < words.size(); n++) {
			for (int i = 0; i < words.size() - 1; i++)
				if (words.get(i).compareTo(words.get(i + 1)) == -1) {
					Wordd temp = words.get(i);
					words.set(i, words.get(i + 1));
					words.set(i + 1, temp);
				}
		}
		for (int i = 0; i < words.size(); i++) {
			System.out.println(words.get(i));
		}

	}
}

