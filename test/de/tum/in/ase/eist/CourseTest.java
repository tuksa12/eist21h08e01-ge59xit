package de.tum.in.ase.eist;

import org.junit.jupiter.api.Test;

public class CourseTest {

	// TODO 1: Test getCourseTitle()
    @Test
    public void testGetCourseTitle() {
        Course testCourse = new Course("Title");
        assert (testCourse.getCourseTitle().equals("Title"));
    }

	// TODO 2: Test getNumberOfAttendees()
    @Test
    public void testNoAttendees() {
        Course testCourse = new Course("Title");
        assert (testCourse.getNumberOfAttendees() == 0);
    }

    @Test
    public void testThreeAttendees() {
        Course testCourse = new Course("Title");
        assert (testCourse.getNumberOfAttendees() == 3);
    }
}
