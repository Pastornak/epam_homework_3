package com.epam.lab.homework3.task2;

public class Person {
	
	private String name;
	private String surname;
	private int age;
	private Car car;
	
	public Person(){}
	
	public Person(String name, String surname, int age) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	
	public String rideCar() {
		return "Riding a car " + car.toString();
	}
	
	public String interract(Person person){
		return this.toString() + " is interracting with " + person.toString();
	}
	
	@Override
	public String toString(){
		return name + " " + surname + " " + age;
	}
}
