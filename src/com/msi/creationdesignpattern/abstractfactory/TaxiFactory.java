package com.msi.creationdesignpattern.abstractfactory;

public class TaxiFactory  implements AbstractCarFactory<Taxi> {
	private int speedPerHour;
	private double price;

	public TaxiFactory(int speedPerHour, double price) {
		super();
		this.speedPerHour = speedPerHour;
		this.price = price;
	}
	
	@Override
	public Taxi create() {
		return new Taxi(speedPerHour, price).create();
	}
}
