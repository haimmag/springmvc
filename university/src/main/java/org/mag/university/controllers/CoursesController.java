package org.mag.university.controllers;

import java.util.List;

import org.mag.university.dao.CourseDAO;
import org.mag.university.dao.StudentDAO;
import org.mag.university.models.Course;
import org.mag.university.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class CoursesController {
	
	@Autowired
	@Qualifier("courseDAO")
    private CourseDAO courseDao;	
	
	@RequestMapping("/courses")
    public List<Course> getCourses() {
        List<Course> listCourses = courseDao.list();
                
        return listCourses;
    }
	
}
