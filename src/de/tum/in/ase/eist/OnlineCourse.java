package de.tum.in.ase.eist;

import java.net.MalformedURLException;
import java.net.URL;

public class OnlineCourse extends Course {

	private URL onlineCourseUrl;

	public OnlineCourse(String title) {
		super(title);
	}

	public URL getOnlineCourseUrl() {
		return onlineCourseUrl;
	}

	public void setOnlineCourseUrl(String urlString) throws MalformedURLException {
		onlineCourseUrl = new URL(urlString);
	}
}
