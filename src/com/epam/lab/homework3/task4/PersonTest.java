package com.epam.lab.homework3.task4;

import static org.junit.Assert.fail;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;

public class PersonTest {
	
	@Rule
	public LogInFileOnFailed rule = new LogInFileOnFailed();
	
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
	
	@Test
	public void testPrivateMethod() throws NoSuchMethodException, SecurityException
		, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<? extends Person> personOneClass = personOne.getClass();
		Method privateMethod = personOneClass.getDeclaredMethod("getBirthdayYear");
		privateMethod.setAccessible(true);
		Assert.assertEquals(privateMethod.invoke(personOne), 1999);
		Assert.assertEquals(privateMethod.invoke(personTwo), 1918);
	}
	
	@Test
	public void testEqualsToFail(){
		Assert.assertEquals(personOne, personTwo);
	}
	
	@Test
	public void testToFail(){
		fail();
	}
}
