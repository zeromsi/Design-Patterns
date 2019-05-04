In 1994, four authors Erich Gamma, Richard Helm, Ralph Johnson and John Vlissides published a book titled Design Patterns - Elements of Reusable Object-Oriented Software which initiated the concept of Design Pattern in Software development.
These authors are collectively known as ``` Gang of Four (GOF) ```.

### principles of object orientated design.

1. Program to an interface not an implementation
2. Favor object composition over inheritance

### Design Patterns Category
There are 23 design patterns which can be classified in three categories: 
#### Creational
Creational design pattern deals with object creation. In general, we used to create object using new keyword which is a pretty hard approach. It gives zero flexibility, if we need to decide object instantiation according to situations. Creational design pattern came to solve this issue.

According to the ```(GOF)``` There are six creational design patterns.

1. Factor
In a factory design pattern, a client requests a common factory class method with a type and necessary data. That method either uses switch case or if-else statements to initialize requested class by type and returns.

Lets explore an implementation,


```xml
public class Client {

	public static void main(String[] args) {
		CarFactory factory = new CarFactory();
		Car carOne = factory.getCar(CarType.TAXI, 30, 120000);
		System.out.println(carOne.create());

		Car carTwo = factory.getCar(CarType.TRUCK, 40, 400000);
		System.out.println(carTwo.create());
	}
	
}
```
Here ``` getCar ``` method of ``` CarFactory ``` class is called to initialize due object. 

```xml

public class CarFactory {

	public Car getCar(CarType type, int speadPerHour, double price) {
		Car car = null;
		switch (type) {
		case TRUCK:
			car = new Truck(speadPerHour, price);
			break;
		case TAXI:
			car = new Taxi(speadPerHour, price);
			break;
		default:
			break;
		}
		return car;
	}

}

```

Here ``` CarFactory ``` is the factory class. I've used switch case to make decision.

2. Abstract Factory
Abstract Factory design pattern deals with the factories of factory. In factory design pattern We'd only one factory class which is common for all but in abstract factory we will create factory for all class. The advantage is that, if we need to add new bean type, we will just plug and play.

Let's take a look at the code.

```xml
public interface CarFactory<T> {

	public abstract T create();
}
```
This is an interface which will be implemented by bean specific factories. 

Bean-

```xml 

public class Truck implements Car<Truck> {
	private int speedPerHour;
	private double price;
	private String name;
	private boolean ifItsPermitted;

	public Truck(int speedPerHour, double price) {
		super();
		this.speedPerHour = speedPerHour;
		this.price = price;
	}

	@Override
	public Truck create() {
		this.name="Truck";
		if(this.speedPerHour>30) {
			this.ifItsPermitted=false;
		}else {
			this.ifItsPermitted=true;
		}
		return this;
	}

	@Override
	public String toString() {
		return "Truck [speedPerHour=" + speedPerHour + ", price=" + price + ", name=" + name + ", ifItsPermitted="
				+ ifItsPermitted + "]";
	}

}

```
Bean specific Factory-

```xml
public class TruckFactory implements AbstractCarFactory<Truck> {
	private int speedPerHour;
	private double price;

	@Override
	public Truck create() {
		return new Truck(speedPerHour, price).create();
	}

	public TruckFactory(int speedPerHour, double price) {
		super();
		this.speedPerHour = speedPerHour;
		this.price = price;
	}

}
```
Factory that will decide which factory to call-

```xml

public class AbstractCarFactory {

	public Car getCar(CarType type, int speadPerHour, double price) {
		Car car = null;
		switch (type) {
		case TRUCK:
			car = (Car) new TruckFactory(speadPerHour, price).create();
			break;
		case TAXI:
			car = (Car) new TaxiFactory(speadPerHour, price).create();
			break;
		default:
			break;
		}
		return car;
	}

}

```


3. Singleton

Singleton design pattern aims at ``` one object at a time  ``` of a class or bean. That means, a singleton class will be static in nature and thread safe. The constructor of a singleton class will be default and private. 

Let's take a look at the code,

```xml

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


```
Here, ``` private static volatile Car instance=null; ``` in this line the variable is set to volatile and static. The keyword ``` volatile ``` will keep the instance up to date by updating cache. The ``` synchronized ``` block will prevent other thread to update instance when one thread is having operation by locking program inside the block.

Client- 

```xml 
public class Client {

	public static void main(String[] args) {
		Car objectOne = Car.getInstance();
		Car objectTwo = Car.getInstance();
		Car objectThree = Car.getInstance();
		System.out.println(objectOne);
		System.out.println(objectTwo);
		System.out.println(objectThree);
	}
	
}
```
output-

```xml
com.msi.creationdesignpattern.singleton.Car@135fbaa4
com.msi.creationdesignpattern.singleton.Car@135fbaa4
com.msi.creationdesignpattern.singleton.Car@135fbaa4

```

4. Builder
4. Object Pool
5. Prototype and


#### Structural and 
#### Behavioral patterns.

