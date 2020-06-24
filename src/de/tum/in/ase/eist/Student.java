package de.tum.in.ase.eist;

import java.util.List;

public class Student extends Person {

	private String majorSubject;
	private String minorSubject;
	private List<Course> courseList;
	private int studentId;

	public Student(String firstName, String lastName, String birthDate, String majorSubject, String minorSubject) {
		super(firstName, lastName, birthDate);
		this.majorSubject = majorSubject;
		this.minorSubject = minorSubject;
	}

	@Override
	public void printPersonalInformation() {
		System.out.println("Student: " + getFirstName() + " " + getLastName() + " " + getBirthDate() + " " + studentId);
	}

	public String getMajorSubject() {
		return majorSubject;
	}

	public void setMajorSubject(String majorSubject) {
		this.majorSubject = majorSubject;
	}

	public String getMinorSubject() {
		return minorSubject;
	}

	public void setMinorSubject(String minorSubject) {
		this.minorSubject = minorSubject;
	}

	public List<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
}
