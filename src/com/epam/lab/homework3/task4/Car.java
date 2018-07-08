package com.epam.lab.homework3.task4;

public class Car {
	
	private String brand;
	private String model;
	private int yearOfManifacture;
	
	public Car(){}

	public Car(String brand, String model, int yearOfManifacture) {
		super();
		this.brand = brand;
		this.model = model;
		this.yearOfManifacture = yearOfManifacture;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYearOfManifacture() {
		return yearOfManifacture;
	}

	public void setYearOfManifacture(int yearOfManifacture) {
		this.yearOfManifacture = yearOfManifacture;
	}
	
	private String privateMethod(){
		return "wow so private many secrets";
	}

	@Override
	public String toString() {
		return brand + " " + model + " " + yearOfManifacture;
	}
	
	@Override
	public boolean equals(Object object){
		if(!(object instanceof Car)){
			return false;
		}
		if(this == object){
			return true;
		}
		Car car = (Car) object;
		return this.brand.equals(car.brand) && this.model.equals(car.model) && this.yearOfManifacture == car.yearOfManifacture;
	}
	
	@Override
	public int hashCode(){
		int hash = yearOfManifacture;
		hash = 31 * hash + brand.hashCode();
		hash = 31 * hash + model.hashCode();
		return hash;
	}
}
