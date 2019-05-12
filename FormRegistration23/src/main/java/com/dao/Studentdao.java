package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jspider.dto.StudentDto;

@Repository
public class Studentdao
{

	@Autowired
	SessionFactory sessionFactory;
	
	public int saveStudent(StudentDto student)
	{
		Session session= sessionFactory.openSession();
		session.beginTransaction();
		int id=(int)session.save(student);
		session.getTransaction().commit();
		return id;
	}
	
	public void deleteStudent(StudentDto student)
	{
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		//Student student = (student)session.get(Student.class, id);
		Transaction tx= session.beginTransaction();
		session.delete(student);
		session.getTransaction().commit();
		
	}
	
}
