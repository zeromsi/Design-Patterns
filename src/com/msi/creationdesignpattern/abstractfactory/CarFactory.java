package com.msi.creationdesignpattern.abstractfactory;

public class CarFactory {

	public Car getCar(CarType type, int speadPerHour, double price) {
		Car car = null;
		switch (type) {
		case TRUCK:
			car = (Car) new TruckFactory(speadPerHour, price).create();
			break;
		case TAXI:
			car = (Car) new TaxiFactory(speadPerHour, price).create();
			break;
		default:
			break;
		}
		return car;
	}

}
