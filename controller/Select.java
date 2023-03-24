package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernate.employee.dto.Employee;

public class Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("shital");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
//		EntityTransaction entityTransactuon=entityManager.getTransaction();
		
		
		
		Employee e=entityManager.find(Employee.class, 103);
		if(e!=null) {
			System.out.println(e);
			
		}else {
			System.out.println("provide Id Present in Database Table");
		}
	

	}

}
