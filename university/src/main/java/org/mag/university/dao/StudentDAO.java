package org.mag.university.dao;

import java.util.List;

import org.mag.university.models.Student;

public interface StudentDAO {
	public List<Student> list();
	
	public Student get(int id);
	
	public void saveOrUpdate(Student user);
	
	public void delete(int id);
}