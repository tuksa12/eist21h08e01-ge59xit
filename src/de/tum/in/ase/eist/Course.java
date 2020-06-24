package de.tum.in.ase.eist;

import java.util.Date;
import java.util.List;

public class Course {

	private String courseTitle;
	private Lecturer lecturer;
	private List<Date> dates;
	private List<Student> attendees;

	public Course(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public String getCourseTitle() {
		return this.courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public Lecturer getLecturer() {
		return lecturer;
	}

	public void setLecturer(Lecturer lecturer) {
		this.lecturer = lecturer;
	}

	public List<Date> getDates() {
		return dates;
	}

	public void setDates(List<Date> dates) {
		this.dates = dates;
	}

	public List<Student> getAttendees() {
		return attendees;
	}

	public void addAttendee(Student student) {
		if (this.attendees != null && !this.attendees.contains(student)) {
			this.attendees.add(student);
		}
	}

	public void setAttendees(List<Student> attendees) {
		this.attendees = attendees;
	}

	public int getNumberOfAttendees() {
		return attendees != null ? attendees.size() : 0;
	}
}
