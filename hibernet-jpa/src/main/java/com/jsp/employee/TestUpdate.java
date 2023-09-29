package com.jsp.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdate {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("tushar"); //persistence name
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Employee employee=	entityManager.find(Employee.class,1);
		employee.setEmail("abc@mail.com");   	//email data to be updated
		
		entityTransaction.begin();
		entityManager.merge(employee);	//update
		entityTransaction.commit();	
	}

}

/*
 
id  cno         email           name
1	1234567890	abc@mail.com	mayur	//updated email
3	1238754356	pratik@mail.com	pratik
4	5687654321	jeevan@mail.com	jeevan
5	2134567890	tejas@mail.com	Tejas
*/			