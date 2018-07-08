package com.epam.lab.homework3.task3;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;

public class CarTest {
	
	@Rule
	public LogInFileOnFailed rule = new LogInFileOnFailed();

	private static Car car;
	private static Car carClone;
	private static Car carCopy;
	
	@BeforeClass
	public static void setUpCar(){
		car = new Car("Porsche", "911", 2000);
		carClone = new Car("Porsche", "911", 2000);
		carCopy = car;
	}
	
	@Test
	public void testToString() {
		Assert.assertEquals("Porsche 911 2000", car.toString());
	}

	@Test
	public void testEquals() {
		Assert.assertTrue(car.equals(car));
		Assert.assertTrue(car.equals(carClone));
		Assert.assertTrue(car.equals(carCopy));
		Assert.assertTrue(carClone.equals(carCopy));
		Assert.assertSame(car, carCopy);
		Assert.assertNotSame(carClone, carCopy);
	}
	
	@Test
	public void testEqualsToFail(){
		Assert.assertNotEquals(car, carClone);
	}
}
