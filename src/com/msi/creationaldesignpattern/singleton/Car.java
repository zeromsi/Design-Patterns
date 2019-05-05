package com.msi.creationaldesignpattern.singleton;

public class Car implements Cloneable{
	
	private static volatile Car instance=null;
	
	private Car() {}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return instance;
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
