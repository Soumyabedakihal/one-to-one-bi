package com.ty.onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Charcy {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int charcyNumber;
	private String type;
	
	@OneToOne(mappedBy="charcy")
	private Vehicle vehicle;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCharcyNumber() {
		return charcyNumber;
	}

	public void setCharcyNumber(int charcyNumber) {
		this.charcyNumber = charcyNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	
}
