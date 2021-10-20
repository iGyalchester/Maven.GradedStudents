package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Student{

	private String firstName;
	private String lastName;

	ArrayList<Double> examScores;

	public Student(String firstName, String lastName, Double[] testScores) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.examScores = new ArrayList<>(Arrays.asList(testScores));
	}



	public Student() {

	}

	public String getFirstName() {

		return firstName;
	}

	public void setFirstName(String firstName) {

		this.firstName = firstName;
	}

	public String getLastName() {

		return lastName;
	}

	public void setLastName(String lastName) {

		this.lastName = lastName;
	}

	public void setExamScores(ArrayList<Double> examScores) {

		this.examScores = examScores;
	}

	public String getExamScores() {

		return examScores.toString();
	}

	public void addExamScore(double examScore) {
		examScores.add(examScore);
	}

	public void setExamScore(int examNumber, double newScore){
		examScores.set(examNumber, newScore);

	}

	public String getAverageExamScore(){
		double average = 0;
		double totalScore = 0;

		for (Double examScore : examScores) {
			totalScore += examScore;
			average = totalScore / examScores.size();
		}
		return String.valueOf(average);

	}

	@Override
	public String toString() {
		return "Student{" +
				"firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", examScores=" + examScores +
				'}' + '\n';
	}
}
