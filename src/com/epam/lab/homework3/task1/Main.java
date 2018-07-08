package com.epam.lab.homework3.task1;

public class Main {

	public static void main(String[] args) {
		Person personOne = new Person("Yurii", "Pasternak", 19);
		personOne.setCar(new Car());
		System.out.println(personOne.rideCar());
		Car emptyCar = new Car();
		System.out.println(emptyCar.getBrand());
	}

}
