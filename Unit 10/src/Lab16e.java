<<<<<<< HEAD
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.out;

import java.io.IOException;

public class Lab16e {
	public static void main(String args[]) throws IOException {
		Histogram test = new Histogram(new char[] { 'd', 'e', 'a' }, "lab16e2.dat");
		test.loadAndAnalyzeFile();
		out.println("Letter occurring most : " + test.mostFrequent());
		out.println("Letter occurring least : " + test.leastFrequent());
		out.println("\n");
		out.println(test);

		// more test cases
	}
=======
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.out;

import java.io.IOException;

public class Lab16e {
	public static void main(String args[]) throws IOException {
		Histogram test = new Histogram(new char[] { 'd', 'e', 'a' }, "lab16e2.dat");
		test.loadAndAnalyzeFile();
		out.println("Letter occurring most : " + test.mostFrequent());
		out.println("Letter occurring least : " + test.leastFrequent());
		out.println("\n");
		out.println(test);

		// more test cases
	}
>>>>>>> 455ca7e6d62a7826901e8e30c3d945436913761e
}