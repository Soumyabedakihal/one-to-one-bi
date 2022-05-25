package com.ty.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveVehicleCharcy {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("soumya");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Vehicle vehicle=new Vehicle();
		vehicle.setName("KTM");
		vehicle.setCost(300000);
		
		Charcy charcy=new Charcy();
		charcy.setCharcyNumber(1600);
		charcy.setType("OnRoad");
		
		vehicle.setCharcy(charcy);
		
		entityTransaction.begin();
		entityManager.persist(vehicle);
		entityTransaction.commit();
	}

}
