package com.msi.creationdesignpattern.singleton;

public class Client {

	public static void main(String[] args) {
		Car objectOne = Car.getInstance();
		Car objectTwo = Car.getInstance();
		Car objectThree = Car.getInstance();
		System.out.println(objectOne);
		System.out.println(objectTwo);
		System.out.println(objectThree);
	}
	
}

