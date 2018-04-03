//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.out;

public class ClassTester {
	public static void main(String args[]) {
		Class test = new Class("Comp Sci 1");
		test.addStudent(new Student("Jimmy", "4 - 100 90 80 60"));
		test.addStudent(new Student("Sandy", "4 - 100 100 80 70"));
		test.addStudent(new Student("Fred", "4 - 50 50 70 68"));
		out.println(test);

		out.println(String.format(test.getStudentName(0) + "\'s average = %.2f", test.getStudentAverage(0)));
		out.println(String.format(test.getStudentName(1) + "\'s average = %.2f", test.getStudentAverage(1)));
		out.println(String.format(test.getStudentName(2) + "\'s average %.2f", test.getStudentAverage(2)));

		out.println(String.format("Sandy" + "\'s average %.2f", test.getStudentAverage("Sandy")));

		out.println("Failure List = " + test.getFailureList(70));
		out.println("Highest Average = " + test.getStudentWithHighestAverage());
		out.println("Lowest Average = " + test.getStudentWithLowestAverage());

		out.println(String.format("Class Average = %.2f", test.getClassAverage()));
	}
}