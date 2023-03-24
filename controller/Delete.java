package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernate.employee.dto.Employee;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("shital");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		
		Employee e=entityManager.find(Employee.class, 105); 
		
		if(e!=null) {
			entityTransaction.begin();
			entityManager.remove(e);
			entityTransaction.commit();
		}
		else {
			System.out.println("Invalid id");
		}
		

	}

}
