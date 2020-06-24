package de.tum.in.ase.eist;

import java.util.List;

public class Lecturer extends Person {

	private List<Course> courseList;
	private int employeeId;

	public Lecturer(String firstName, String lastName, String birthDate) {
		super(firstName, lastName, birthDate);
	}

	@Override
	public void printPersonalInformation() {
		System.out.println("Lecturer: " + getFirstName() + " " + getLastName() + " " + getBirthDate() + " " + employeeId);
	}

	public List<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
}
