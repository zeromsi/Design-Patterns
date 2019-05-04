package com.msi.creationaldesignpattern.builder;

public class Car {
	
	public static class Builder{
		private String brand;
		private String type;
		private String model;
		
		public Builder() {
		}
		
		public Car build() {
			return new Car(this);
		}
		
		public Builder brand(Brand brand) {
			this.brand=brand.name();
			return this;
		}
		
		public Builder type(Type type) {
			this.type=type.name();
			return this;
		}
		
		public Builder model(Model model) {
			this.model=model.name();
			return this;
		}
		
	}
	
	private String brand;
	private String type;
	private String model;
	
	
	public Car(Builder builder) {
		this.brand=builder.brand;
		this.type=builder.type;
		this.model=builder.model;
	}
	
	public String getBrand() {
		return brand;
	}
	public String getType() {
		return type;
	}
	public String getModel() {
		return model;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", type=" + type + ", model=" + model + "]";
	}


}
