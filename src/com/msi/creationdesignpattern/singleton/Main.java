package com.msi.creationdesignpattern.singleton;

public class Main {

	public static void main(String[] args) {
		SingletonObject object=SingletonObject.getInstance();
		SingletonObject object2=SingletonObject.getInstance();
		object2.name="zero";
		SingletonObject object3=SingletonObject.getInstance();
		object3.name="zeromsi";
		
		object.printName();
		object2.printName();
		object3.printName();
		
 	}

}
