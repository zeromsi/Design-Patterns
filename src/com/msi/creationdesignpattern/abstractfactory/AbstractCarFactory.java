package com.msi.creationdesignpattern.abstractfactory;

public interface AbstractCarFactory<T> {

	public abstract T create();
}
