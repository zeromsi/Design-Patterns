package com.msi.creationaldesignpattern.factory;

public class Client {

	public static void main(String[] args) {
		CarFactory factory = new CarFactory();
		Car carOne = factory.getCar(CarType.TAXI, 30, 120000);
		System.out.println(carOne.create());

		Car carTwo = factory.getCar(CarType.TRUCK, 40, 400000);
		System.out.println(carTwo.create());
	}

}
