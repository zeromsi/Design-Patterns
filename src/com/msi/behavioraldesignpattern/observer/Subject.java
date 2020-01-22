package com.msi.behavioraldesignpattern.observer;
public interface Subject {

	void attach(Observer o);
	void detach(Observer o);
	void Notify();
}