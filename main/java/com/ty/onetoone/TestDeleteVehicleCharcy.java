package com.ty.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDeleteVehicleCharcy {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("soumya");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Vehicle vehicle=entityManager.find(Vehicle.class, 3);
		if(vehicle!=null)
		{
			entityTransaction.begin();
			entityManager.remove(vehicle);
			entityTransaction.commit();
		}
		else
		{
			System.out.println("Sorry no data to delete");
		}
	}

}
