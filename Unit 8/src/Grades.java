//A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;

public class Grades {
	// instance variables
	private double[] grades;

	public Grades() {
		setGrades("");
	}

	// constructor
	public Grades(String gradeList) {
		setGrades(gradeList);
	}

	// set method
	public void setGrades(String gradeList) {

		Scanner chop = new Scanner(gradeList);
		grades = new double[chop.nextInt()];
		chop.next();
		for (int i = 0; i < grades.length; i++) {
			grades[i] = chop.nextDouble();
		}
	}

	private double getSum() {
		double sum = 0.0;
		for (int i = 0; i < grades.length; i++) {
			sum += grades[i];
		}
		return sum;
	}

	public double getAverage() {
		double average = 0.0;
		average = getSum() / grades.length;
		return average;
	}

	public String toString() {
		String output = "";
		for (int i = 0; i < grades.length; i++) {
			output += "Grade " + i + " is :: " + grades[i] + "\n";
		}
		output += "\nThe Average grade is: " + getAverage() + "\n";
		return output;
	}

	// toString method

}