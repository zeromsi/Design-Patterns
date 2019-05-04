package com.msi.creationaldesignpattern.factory;

public interface Car<T> {
	public T create();
}
