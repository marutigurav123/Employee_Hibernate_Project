package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.hibernate.employee.dto.Employee;



public class SelectAll {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("shital");
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		

//	       String jpql="select e from Employee e";
//			
//			Query q =entityManager.createQuery(jpql);
//			List<Employee> e = q.getResultList();
//			
//			System.out.println(e);
		
		String jpql="select e from Employee e";
		Query q=entityManager.createQuery(jpql);
		List<Employee> e=q.getResultList();
		System.out.println(e);

	}

}
