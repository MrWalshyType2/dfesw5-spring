package com.example.demo.data.model;

import javax.persistence.Entity;
import javax.persistence.Id;

// @Entity is picked up by Hibernate, which will automatically map objects to and from
// json data for us
@Entity // Specifies that this is a persistable type, i.e. in a database
public class Car {
	
	private static int ID_COUNTER = 0;

	@Id // required by any class marked with @Entity
	private int id; // this is the primary key in a MySql DB
	// litres
	private double engineSize;
	private int mileage;
	private int yearManufactured;
	private String colour;
	private String manufacturer;
	private String model;
	
	public Car() {
		
	}
	
	public Car(double engineSize, int mileage, int yearManufactured, String colour, String manufacturer, String model) {
		super();
		// 'this' is referring to the current object being created
		this.id = ID_COUNTER++; // only supplying the id here as are not yet using a database
		this.engineSize = engineSize;
		this.mileage = mileage;
		this.yearManufactured = yearManufactured;
		this.colour = colour;
		this.manufacturer = manufacturer;
		this.model = model;
	}

	public Car(int id, double engineSize, int mileage, int yearManufactured, String colour, String manufacturer, String model) {
		super();
		// 'this' is referring to the current object being created
		this.id = id;
		this.engineSize = engineSize;
		this.mileage = mileage;
		this.yearManufactured = yearManufactured;
		this.colour = colour;
		this.manufacturer = manufacturer;
		this.model = model;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public int getYearManufactured() {
		return yearManufactured;
	}

	public void setYearManufactured(int yearManufactured) {
		this.yearManufactured = yearManufactured;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	
}
