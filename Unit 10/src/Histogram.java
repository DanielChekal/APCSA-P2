<<<<<<< HEAD
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.out;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Histogram {
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;

	public Histogram() {
		count = new ArrayList<Integer>();
		letters = new ArrayList<Character>();
	}

	public Histogram(char[] values, String fName) {
		this();
		fileName = fName;
		for (int i = 0; i < values.length; i++) {
			letters.add(values[i]);
			count.add(0);
		}
		out.println("search letters = " + letters);
	}

	public void loadAndAnalyzeFile() throws IOException {
		String word = "";
		Scanner file = new Scanner(new File("/Users/fireguy/Documents/workspace/Unit 10/src/" + fileName));
		int myvar = file.nextInt();
		for (int i = 0; i < myvar; i++) {
			while (file.hasNext()) {
				word = file.next();
				for (int j = 0; j < letters.size(); j++) {
					for (int m = 0; m < word.length(); m++) {
						if (word.charAt(m) == letters.get(j))
							count.set(j, count.get(j) + 1);
					}
				}
			}

		}

	}

	public char mostFrequent() {
		int i = Collections.max(count);
		return letters.get(count.indexOf(i));
	}

	public char leastFrequent() {
		int i = Collections.min(count);
		return letters.get(count.indexOf(i));
	}

	public String toString() {
		return fileName + "\n" + letters + "\n" + count + "\n\n\n";
	}
=======
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.out;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Histogram {
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;

	public Histogram() {
		count = new ArrayList<Integer>();
		letters = new ArrayList<Character>();
	}

	public Histogram(char[] values, String fName) {
		this();
		fileName = fName;
		for (int i = 0; i < values.length; i++) {
			letters.add(values[i]);
			count.add(0);
		}
		out.println("search letters = " + letters);
	}

	public void loadAndAnalyzeFile() throws IOException {
		String word = "";
		Scanner file = new Scanner(new File("/Users/fireguy/Documents/workspace/Unit 10/src/" + fileName));
		int myvar = file.nextInt();
		for (int i = 0; i < myvar; i++) {
			while (file.hasNext()) {
				word = file.next();
				for (int j = 0; j < letters.size(); j++) {
					for (int m = 0; m < word.length(); m++) {
						if (word.charAt(m) == letters.get(j))
							count.set(j, count.get(j) + 1);
					}
				}
			}

		}

	}

	public char mostFrequent() {
		int i = Collections.max(count);
		return letters.get(count.indexOf(i));
	}

	public char leastFrequent() {
		int i = Collections.min(count);
		return letters.get(count.indexOf(i));
	}

	public String toString() {
		return fileName + "\n" + letters + "\n" + count + "\n\n\n";
	}
>>>>>>> 455ca7e6d62a7826901e8e30c3d945436913761e
}