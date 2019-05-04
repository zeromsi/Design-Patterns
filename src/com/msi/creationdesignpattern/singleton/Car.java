package com.msi.creationdesignpattern.singleton;

public class Car {
	
	private static volatile Car instance=null;
	
	private Car() {}
	
	public static Car getInstance() {
		if(instance==null) {
			synchronized (Car.class) {
				if(instance==null) {
					instance=new Car();
				}
			}
		}
		return instance;
	}
	

}
