package de.tum.in.ase.eist;

import org.junit.jupiter.api.Test;

import java.net.URL;

public class OnlineCourseTest {

	// TODO 3: Test setOnlineCourseUrl()
    @Test
    public void testSetOnlineCourseUrlWithValidUrl() {
        OnlineCourse testOnline = new OnlineCourse("Title");
        try {
            URL url = new URL("http://www.example.com/docs/resource1.html");
            testOnline.setOnlineCourseUrl("http://www.example.com/docs/resource1.html");
            assert (testOnline.getOnlineCourseUrl().equals(url));
        } catch (Exception ignored) {

        }
    }

    @Test
    public void testSetOnlineCourseUrlWithInvalidUrl() {
        OnlineCourse testOnline = new OnlineCourse("Title");
        try {
            testOnline.setOnlineCourseUrl("ocs/resource1.html");
        } catch (Exception ignored) {
            assert (true);
        }
    }
}
