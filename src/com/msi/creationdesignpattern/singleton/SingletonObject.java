package com.msi.creationdesignpattern.singleton;

public class SingletonObject {
	public String name="msi";
	
	private static SingletonObject instance=new SingletonObject();
	
	private SingletonObject() {}
	
	public static SingletonObject getInstance() {
		return instance;
	}
	
	public void printName() {
		System.out.println(name);
	}

}
