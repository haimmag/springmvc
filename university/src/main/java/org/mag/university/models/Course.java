package org.mag.university.models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
 
@Entity
@Table(name = "courses")
public class Course {
 
    long id;
    String name;
    Set<Student> students;
 
    public Course() {
 
    }
 
    public Course(String name) {
        this.name = name;
    }
 
    @Id
    @GeneratedValue
    @Column(name = "course_id")
    public long getId() {
        return id;
    }
 
    public void setId(long id) {
        this.id = id;
    }
 
    @Column
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
  
    @ManyToMany(mappedBy = "courses", fetch = FetchType.EAGER)
    @JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@course_id")
    public Set<Student> getStudents() {
        return students;
    }
 
    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}
