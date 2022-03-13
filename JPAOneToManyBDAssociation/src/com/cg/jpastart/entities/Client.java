package com.cg.jpastart.entities;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client 
{
	public static void main(String[] args)
	{
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager em = factory.createEntityManager();
	em.getTransaction().begin();
	
	Department department=new Department();
	department.setId(10);
	department.setName("C2TC");
	
	Department department1=new Department();
	department1.setId(11);
	department1.setName("C2C");
	
	Employee employee1=new Employee();
	employee1.setEid(101);
	employee1.setEname("Gayatri");
	employee1.setEsalary(500);
	
	Employee employee2=new Employee();
	employee2.setEid(102);
	employee2.setEname("Vikas");
	employee2.setEsalary(1000);
	
	Employee employee3=new Employee();
	employee3.setEid(103);
	employee3.setEname("Sabiha");
	employee3.setEsalary(5000);
	
	department.addEmployee(employee1);
	department.addEmployee(employee2);
	department1.addEmployee(employee3);
	
	em.persist(department);
	em.persist(department1);
	
	System.out.println("Added department along with two employees to database.");
	
	em.getTransaction().commit();
}
}
