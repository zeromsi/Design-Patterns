package com.msi.creationaldesignpattern.factory;

public class CarFactory {

	public Car getCar(CarType type, int speadPerHour, double price) {
		Car car = null;
		switch (type) {
		case TRUCK:
			car = new Truck(speadPerHour, price);
			break;
		case TAXI:
			car = new Taxi(speadPerHour, price);
			break;
		default:
			break;
		}
		return car;
	}

}
