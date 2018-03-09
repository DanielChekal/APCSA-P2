//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.out;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class MadLib {
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;

	public MadLib() {
		verbs = new ArrayList<String>();
		nouns = new ArrayList<String>();
		adjectives = new ArrayList<String>();
	}

	public MadLib(String fileName) {
		// load stuff
		this();

		loadNouns();
		loadVerbs();
		loadAdjectives();
		try {
			Scanner file = new Scanner(new File(fileName));
			while (file.hasNext()) {
				String symbol = file.next();
				if (symbol.equals("#")) {
					out.print(getRandomNoun() + " ");
				} else if (symbol.equals("@")) {
					out.print(getRandomVerb() + " ");
				} else if (symbol.equals("&")) {
					out.print(getRandomAdjective() + " ");
				} else {
					out.print(symbol + " ");
				}
			}
		} catch (Exception e) {
			out.println("Houston we have a problem!");
		}

	}

	public void loadNouns() {
		try {
			Scanner file = new Scanner(new File("/Users/fireguy/Documents/workspace/Unit 10/src/nouns.dat"));
			while (file.hasNext()) {
				nouns.add(file.next());
			}
		} catch (Exception e) {

		}

	}

	public void loadVerbs() {
		try {
			Scanner file = new Scanner(new File("/Users/fireguy/Documents/workspace/Unit 10/src/verbs.dat"));
			while (file.hasNext()) {
				verbs.add(file.next());
			}
		} catch (Exception e) {

		}
	}

	public void loadAdjectives() {
		try {
			Scanner file = new Scanner(new File("/Users/fireguy/Documents/workspace/Unit 10/src/adjectives.dat"));
			while (file.hasNext()) {
				adjectives.add(file.next());
			}
		} catch (Exception e) {

		}
	}

	public String getRandomVerb() {

		return verbs.get((int) (Math.random() * verbs.size()));
	}

	public String getRandomNoun() {

		return nouns.get((int) (Math.random() * nouns.size()));
	}

	public String getRandomAdjective() {

		return adjectives.get((int) (Math.random() * adjectives.size()));
	}

	public String toString() {
		return "\n\n\n";
	}
}