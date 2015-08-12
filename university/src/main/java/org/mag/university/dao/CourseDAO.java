package org.mag.university.dao;

import java.util.List;

import org.mag.university.models.Course;

public interface CourseDAO {
	public List<Course> list();
	
	public Course get(int id);
	
	public void saveOrUpdate(Course user);
	
	public void delete(int id);
}