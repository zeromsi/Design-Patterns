package com.msi.creationdesignpattern.abstractfactory;

public interface CarFactory<T> {

	public abstract T create();
}
