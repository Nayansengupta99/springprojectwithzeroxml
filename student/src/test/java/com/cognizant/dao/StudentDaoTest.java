package com.cognizant.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cognizant.modal.Student;


public class StudentDaoTest {

	private StudentDao studentDao;
	private Student student;
	@Before
	public void setup() {
    	@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(resources.AppConfig.class);
    	this.studentDao = (StudentDao)context.getBean("studentDao");
		this.student = new Student(11, "Nayan Sengupta", 10.0f);
	}
	
	
	@Test
	public void testInsert() {
		boolean actual = studentDao.insert(student);
		boolean expected = true;
	    assertEquals(expected, actual);
	}

	@Test
	public void testGetAll() {
		List<Student> students = studentDao.getAll();
		assertEquals(1, students.size());
		assertEquals(student, students.get(0));
	}

}
