package com.EducationSystem.DTO;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class courses {
	@Id
	private int id;
	private String courses;

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}
	
	

}
