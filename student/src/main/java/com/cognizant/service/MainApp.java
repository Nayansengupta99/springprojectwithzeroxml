package com.cognizant.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cognizant.dao.StudentDao;
import com.cognizant.modal.Student;

/**
 * Hello world!
 *
 */
public class MainApp 
{
	
	
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(resources.AppConfig.class);
    	StudentDao studentDao = (StudentDao)context.getBean("studentDao");
    	Student s1 = new Student(1, "Nayan", 90);
    	Student s2 = new Student(2, "Sayan", 60);
    	Student s3 = new Student(3, "Ayan", 70);
    	studentDao.insert(s1);
    	studentDao.insert(s2);
    	studentDao.insert(s3);
        List<Student> students = studentDao.getAll();
        students.forEach(student->System.out.println(student));
    }
}
