package com.jsp.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {

	public static void main(String[] args) {
		
		
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("tushar");

		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Employee employee=new Employee();
		
		employee.setName("Tejas");
		employee.setEmail("tejas@mail.com");
		employee.setCno(2134567890l);
		
		entityTransaction.begin();
		entityManager.persist(employee);	//save data
		entityTransaction.commit();
	}
}
/*
 
id  cno         email           name
1	1234567890	abc@mail.com	mayur
2	1234122890	ram@mail.com	ram
3	1238754356	pratik@mail.com	pratik
4	5687654321	jeevan@mail.com	jeevan
5	2134567890	tejas@mail.com	Tejas
*/		