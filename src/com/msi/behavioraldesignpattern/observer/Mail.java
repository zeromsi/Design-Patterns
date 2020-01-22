package com.msi.behavioraldesignpattern.observer;
public class Mail {

	String receiverName;
	String content;
	String address;

	public Mail(String receiverName, String content, String address) {

		this.receiverName = receiverName;
		this.content = content;
		this.address = address;
	}



}