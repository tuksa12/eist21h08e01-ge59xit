package de.tum.in.ase.eist;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class CourseTest {

	// TODO 1: Test getCourseTitle()
    @Test
    public void testGetCourseTitle() {
        Course testCourse = new Course("Title");
        assertEquals(testCourse.getCourseTitle(),"Title");
    }

	// TODO 2: Test getNumberOfAttendees()
    @Test
    public void testNoAttendees() {
        Course testCourse = new Course("Title");
        assertEquals(testCourse.getAttendees(), 0);
    }

    @Test
    public void testThreeAttendees() {
        Course testCourse = new Course("Title");
        assertEquals(testCourse.getAttendees(), 3);
    }
}
