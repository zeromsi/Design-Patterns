package com.msi.creationaldesignpattern.singleton;

public class Car {
	
	private static volatile Car instance=null;
	
	
	private Car() {
		if (instance != null) {
			throw new RuntimeException("Instance already initialized. Please call getInstance()");
		}
	}
	
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
