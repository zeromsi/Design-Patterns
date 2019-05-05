package com.msi.creationaldesignpattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.msi.creationaldesignpattern.singleton.Car;

public class Client {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Car objectOne = Car.getInstance();
		Car objectTwo = Car.getInstance();
		System.out.println(objectOne);
		System.out.println(objectTwo);
		
		// Breaching with reflection API
		Class clazz  = Class.forName("com.msi.creationaldesignpattern.singleton.Car");
		Constructor<Car> ctor = clazz.getDeclaredConstructor();
		ctor.setAccessible(true);
		Car objectThree = ctor.newInstance();
		System.out.println(objectThree);
	}
	
}

