package org.mag.university.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.mag.university.models.Course;
import org.mag.university.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class CourseDAOImpl implements CourseDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public CourseDAOImpl() {
		
	}
	
	public CourseDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public List<Course> list() {
		@SuppressWarnings("unchecked")
		List<Course> listCourses = (List<Course>) sessionFactory.getCurrentSession()
				.createCriteria(Course.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listCourses;
	}

	@Override
	@Transactional
	public void saveOrUpdate(Course course) {
		sessionFactory.getCurrentSession().saveOrUpdate(course);
	}

	@Override
	@Transactional
	public void delete(int id) {
		Student courseToDelete = new Student();
		courseToDelete.setId(id);
		sessionFactory.getCurrentSession().delete(courseToDelete);
	}

	@Override
	@Transactional
	public Course get(int id) {
		String hql = "from User where id=" + id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Course> listCourses = (List<Course>) query.list();
		
		if (listCourses != null && !listCourses.isEmpty()) {
			return listCourses.get(0);
		}
		
		return null;
	}
}