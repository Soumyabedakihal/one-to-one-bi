package com.ty.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestGetVehicleById_Charcy {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("soumya");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Vehicle vehicle=entityManager.find(Vehicle.class, 2);
		System.out.println("Vehicle name:"+vehicle.getName());
		System.out.println("Vehicle Cost:"+vehicle.getCost());
		
	}

}
