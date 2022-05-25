package com.ty.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetPan {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("soumya");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Pan pan=entityManager.find(Pan.class, 1);
		
		System.out.println("Pan address"+pan.getAddress());
		System.out.println("Pan Number" +pan.getPanNumber());
		
		Person person=pan.getPerson();
		System.out.println("Person name"+person.getName());
		System.out.println("Person email"+person.getEmail());
	}

}
