package com.msi.creationaldesignpattern.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.msi.creationaldesignpattern.singleton.Car;

public class Client {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, CloneNotSupportedException, IOException {
		Car objectOne = Car.getInstance();
		Car objectTwo = Car.getInstance();
		Car objectThree = Car.getInstance();
		System.out.println(objectOne);
		System.out.println(objectTwo);
		
		//No Breaching with object clonning 
		Car clonedObject=(Car) objectOne.clone();
		System.out.println(clonedObject);
		
		
		//No Bleaching with object serialization
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
		out.writeObject(objectOne);
		out.close();
		ObjectInput in = new ObjectInputStream(new FileInputStream("singleton.ser"));
		Car objectFour = (Car) in.readObject();
		in.close();

		System.out.println(objectOne);
		System.out.println(objectFour);
		
		
		// Breaching with reflection API
		Class clazz  = Class.forName("com.msi.creationaldesignpattern.singleton.Car");
		Constructor<Car> ctor = clazz.getDeclaredConstructor();
		ctor.setAccessible(true);
		Car objectFive = ctor.newInstance();
		System.out.println(objectFive);
		
	}
	
}

