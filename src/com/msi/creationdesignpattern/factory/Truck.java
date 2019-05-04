package com.msi.creationdesignpattern.factory;

public class Truck implements Car<Truck> {
	private int speedPerHour;
	private double price;
	private String name;
	private boolean ifItsPermitted;

	public Truck(int speedPerHour, double price) {
		super();
		this.speedPerHour = speedPerHour;
		this.price = price;
	}

	@Override
	public Truck create() {
		this.name="Truck";
		if(this.speedPerHour>30) {
			this.ifItsPermitted=false;
		}else {
			this.ifItsPermitted=true;
		}
		return this;
	}

	@Override
	public String toString() {
		return "Truck [speedPerHour=" + speedPerHour + ", price=" + price + ", name=" + name + ", ifItsPermitted="
				+ ifItsPermitted + "]";
	}

}
