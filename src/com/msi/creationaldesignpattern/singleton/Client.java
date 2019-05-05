package com.msi.creationaldesignpattern.singleton;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		Car objectOne = Car.getInstance();
		Car objectTwo = Car.getInstance();
		Car objectThree = Car.getInstance();
		Car clonedObject=(Car) objectOne.clone();
		System.out.println(objectOne);
		System.out.println(objectTwo);
		System.out.println(objectThree);
		System.out.println(clonedObject);
	}
	
}

