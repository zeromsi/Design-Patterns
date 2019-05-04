package com.msi.creationaldesignpattern.abstractfactory;

public class TruckFactory implements CarFactory<Truck> {
	private int speedPerHour;
	private double price;

	@Override
	public Truck create() {
		return new Truck(speedPerHour, price).create();
	}

	public TruckFactory(int speedPerHour, double price) {
		super();
		this.speedPerHour = speedPerHour;
		this.price = price;
	}

}
