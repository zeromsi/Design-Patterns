package com.msi.creationaldesignpattern.builder;

public class Client {

	public static void main(String[] args) {
		Car.Builder car=new Car.Builder()
				.brand(Brand.AUDI)
				.model(Model.M001)
				.type(Type.SPORTSCAR);
		System.out.println(car.build());
	}

}
