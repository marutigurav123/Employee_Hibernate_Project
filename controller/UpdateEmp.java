package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernate.employee.dto.Employee;

public class UpdateEmp {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("shital");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Employee e=new Employee();
		e.setId(102);
		e.setAddress("kolhapur");
		
		
		entityTransaction.begin();
		entityManager.merge(e);
		entityTransaction.commit();
		

	}

}
