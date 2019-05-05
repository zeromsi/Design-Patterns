package com.msi.creationaldesignpattern.singleton;

import java.io.Serializable;

public class Car implements Cloneable,Serializable{
	
	private static volatile Car instance=null;
	
	
	private Car() {
		if (instance != null) {
			throw new RuntimeException("Instance already initialized. Please call getInstance()");
		}
	}
	
	protected Object readResolve() {
		if(instance==null) {
			synchronized (Car.class) {
				if(instance==null) {
					instance=new Car();
				}
			}
		}
		return instance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		if(instance==null) {
			synchronized (Car.class) {
				if(instance==null) {
					instance=new Car();
				}
			}
		}
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
