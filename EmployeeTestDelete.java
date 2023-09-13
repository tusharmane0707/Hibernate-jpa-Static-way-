package com.jsp.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDelete {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("tushar");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
	Employee employee=	entityManager.find(Employee.class, 2);
		
		if(employee!=null) {
			entityTransaction.begin();
			entityManager.remove(employee);	//delete id 2 data
			entityTransaction.commit();
			
		}else {
			System.out.println("Not Deleted");
		}
	}

}

/*
id  cno         email           name
1	1234567890	mayur@mail.com	mayur
3	1238754356	pratik@mail.com	pratik
4	5687654321	jeevan@mail.com	jeevan
5	2134567890	tejas@mail.com	Tejas
			
			*/
