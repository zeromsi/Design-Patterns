package com.msi.creationaldesignpattern.abstractfactory;

public interface CarFactory<T> {

	public abstract T create();
}
