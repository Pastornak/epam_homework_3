package com.epam.lab.homework3.task2;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class PersonTest {
	
	private static Person personOne;
	private static Person personTwo;

	@BeforeClass
	public static void setUpPersons(){
		personOne = new Person("Yurii", "Pasternak", 19);
		personOne.setCar(new Car("Honda", "Civic", 1990));
		
		personTwo = new Person("Nazar", "Leshchuk", 100);
		personTwo.setCar(new Car());
	}
	
	@Test
	public void testToString(){
		Assert.assertEquals("Yurii Pasternak 19", personOne.toString());
		Assert.assertEquals("Nazar Leshchuk 100", personTwo.toString());
	}
	
	@Test
	public void testRideCar(){
		Assert.assertEquals("Riding a car Honda Civic 1990", personOne.rideCar());
	}
	
	@Test
	public void testEmptyInitializedCar(){
		Assert.assertNull(personTwo.getCar().getBrand());
		Assert.assertNull(personTwo.getCar().getModel());
		Assert.assertEquals("Riding a car null null 0", personTwo.rideCar());
	}
	
	@Test
	public void testInterract(){
		Assert.assertEquals("Yurii Pasternak 19 is interracting with Nazar Leshchuk 100", personOne.interract(personTwo));
	}

}
