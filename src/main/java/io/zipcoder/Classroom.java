package io.zipcoder;

import java.util.*;

public class Classroom implements Comparable<Student>{


	Student[] students;

	public Classroom(Student[] students) {
		this.students = students;
	}

	public Classroom(int maxNumberOfStudents ) {
		this.students = new Student[maxNumberOfStudents];

	}

	public Classroom(Student[] student, int maxNumberOfStudents) {
		this.students = student;
		this.students = new Student[maxNumberOfStudents];

	}

	public Classroom(Student student) {

	}


	public Student[] getStudents() {

		return this.students;
	}


	public Double getAverageExamScore(Double[] score) {
		double averageScore = 0;
		double totalScore = 0;

		for (Double s : score ) {
			totalScore += s;
			averageScore = score.length * score.length;

		}

		return averageScore;

	}

	public void addStudent(Student student) {
		ArrayList<Student> studs = new ArrayList<Student>();
		for(Student s : students) {
			if(Objects.nonNull(s)){
				studs.add(s);
			}
		}
		studs.add(student);

		this.students = studs.toArray(new Student[studs.size()]);
//		int index = 0;
//		for (int i = 0; i < students.length; i++) {
//			this.students = new Student[i+1];
//			this.students[i] = student;
//		}
	}
	public void removeStudent(String firstName, String lastName) {
		ArrayList<Student> studs = new ArrayList<Student>(Arrays.asList(students));
//		studs.removeIf(s -> s.getFirstName().equalsIgnoreCase(firstName) && s.getLastName().equalsIgnoreCase(lastName));
//		studs.removeIf(s -> s.getFirstName().equalsIgnoreCase(firstName) && s.getLastName().equalsIgnoreCase(lastName));

		this.students = studs.toArray(new Student[students.length]);
	}

	public void getStudentsByScore(){
		List<Student> studs = new ArrayList<>(Arrays.asList(students));
		for (Student s : studs){
			System.out.println(s.getAverageExamScore());

		}
	}

	@Override
	public int compareTo(Student o) {
		if (o.getAverageExamScore().equals(o.getAverageExamScore())){
			return 0;
		}else if (!o.getAverageExamScore().equals(o.getAverageExamScore())){
			return 1;
		}
		return -1;
	}
}
