package com.msi.creationdesignpattern.factory;

public class Taxi implements Car<Taxi> {
	private int speedPerHour;
	private double price;
	private String name;
	private boolean ifItsPermitted;

	public Taxi(int speedPerHour, double price) {
		super();
		this.speedPerHour = speedPerHour;
		this.price = price;
	}

	@Override
	public Taxi create() {
		this.name="Taxi";
		if(this.speedPerHour>40) {
			this.ifItsPermitted=false;
		}else {
			this.ifItsPermitted=true;
		}
		return this;
	}

	@Override
	public String toString() {
		return "Taxi [speedPerHour=" + speedPerHour + ", price=" + price + ", name=" + name + ", ifItsPermitted="
				+ ifItsPermitted + "]";
	}

	

}
