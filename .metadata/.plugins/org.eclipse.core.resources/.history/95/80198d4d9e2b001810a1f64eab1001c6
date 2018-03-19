//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Wordd implements Comparable<Wordd> {
	private String word;

	public Wordd(String s) {
		word = s;

	}

	private int numVowels() {
		String vowels = "AEIOUaeiou";
		int vowelCount = 0;
		for (int i = 0; i < word.length(); i++)
			for (int j = 0; j < vowels.length(); j++) {
				if (word.charAt(i) == vowels.charAt(j)) {
					vowelCount++;
				}
			}
		return vowelCount;
	}

	public int compareTo(Wordd rhs) {
		if (word.equals(rhs))
			return 0;
		if (numVowels() < rhs.numVowels())
			return 1;
		if (numVowels() == rhs.numVowels()) {
			int minLength = Math.min(word.length(), rhs.getWord().length());
			for (int i = 0; i < minLength; i++) {
				if (word.charAt(i) != rhs.getWord().charAt(i)) {
					if (word.charAt(i) < rhs.getWord().charAt(i)) {
						return 1;
					}
					return -1;
				}
			}
		}
		return -1;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String toString() {
		return word;
	}
}
