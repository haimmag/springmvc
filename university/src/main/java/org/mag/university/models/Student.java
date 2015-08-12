package org.mag.university.models;

import java.util.HashSet;
import java.util.Set;
 
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "students")
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@student_id")
public class Student {
	   long id;
	    String firstName;
	    String lastName;
	    Set<Course> courses;
	 
	    public Student() {
	 
	    }
	 
	    public Student(String firstName, String lastName) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.courses = new HashSet<Course>();
	    }
	 
	    @Id
	    @GeneratedValue
	    @Column(name = "student_id")
	    public long getId() {
	        return id;
	    }
	 
	    public void setId(long id) {
	        this.id = id;
	    }
	 
	    @Column
	    public String getFirstName() {
	        return firstName;
	    }
	 
	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }
	 
	    @Column
	    public String getLastName() {
	        return lastName;
	    }
	 
	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }
	 
	    @ManyToMany(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	    @JoinTable(name = "student_course", joinColumns = { @JoinColumn(name = "student_id") }, inverseJoinColumns = { @JoinColumn(name = "course_id") })	    
	    public Set<Course> getCourses() {
	        return courses;
	    }
	 
	    public void setCourses(Set<Course> courses) {
	        this.courses = courses;
	    }

}
