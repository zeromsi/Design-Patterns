package com.msi.creationdesignpattern.factory;

public interface Car<T> {
	public T create();
}
