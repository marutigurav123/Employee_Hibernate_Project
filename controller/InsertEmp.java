package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernate.employee.dto.Employee;

public class InsertEmp {

	public static void main(String[] args) {
		
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("shital");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Employee e1=new Employee();
		e1.setId(103);
		e1.setName("Ram");
		e1.setAddress("Pune");
		
		entityTransaction.begin();
		entityManager.persist(e1);
		entityTransaction.commit();
		
		
		
		
		

	}

}
