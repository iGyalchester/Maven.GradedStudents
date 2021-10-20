package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		// : Given
		String firstName = "Leon";
		String lastName = "Hunter";
		Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
		Double[] examScores0 = { 100.0, 150.0, 250.0, 0.0 };
		Student student = new Student(firstName, lastName, examScores);
		Student student0 = new Student(firstName, lastName, examScores0);

		int maxNumberOfStudents = 1;
		Classroom classroom = new Classroom(maxNumberOfStudents);
		Double[] examScores1 = { 100.0, 150.0, 250.0, 0.0 };
		Student student1 = new Student("Leon", "Hunter", examScores1);

		String output = student.getExamScores();

		System.out.println("===========================");
		System.out.println(output);

		//When
		student.addExamScore(100.0);
		String output0 = student0.getExamScores();

		// Then
		System.out.println("===========================");
		System.out.println(output0);

		// When
		String output1 = student0.getAverageExamScore();

		// Then
		System.out.println("===========================");
		System.out.println(output1);

		// When
		String output2 = student.toString();

		// Then
		System.out.println("===========================");
		System.out.println(output2);

		// When
		Student[] preEnrollment = classroom.getStudents();
		classroom.addStudent(student1);

		Student[] postEnrollment = classroom.getStudents();

		// Then
		String preEnrollmentAsString = Arrays.toString(preEnrollment);
		String postEnrollmentAsString = Arrays.toString(postEnrollment);

		System.out.println("===========================");
		System.out.println(preEnrollmentAsString);
		System.out.println("===========================");
		System.out.println(postEnrollmentAsString);


		classroom.removeStudent("Leon", "Hunter");

	}

}
