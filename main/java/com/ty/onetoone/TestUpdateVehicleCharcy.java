package com.ty.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdateVehicleCharcy {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("soumya");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Vehicle vehicle=entityManager.find(Vehicle.class, 2);
		if(vehicle!=null)
		{	
			Charcy ch= vehicle.getCharcy();
			entityTransaction.begin();
			vehicle.setName("R15");
			ch.setCharcyNumber(456);
			entityManager.merge(vehicle);
			entityTransaction.commit();
		}
		else
		{
			System.out.println("not modify");
		}
	}

}
