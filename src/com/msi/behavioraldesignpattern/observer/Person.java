package com.msi.behavioraldesignpattern.observer;

import java.util.ArrayList;

public class Person implements Observer{

	String name;

	public Person(String name) {
		this.name = name;
	}
	
	public void checkMail(ArrayList<Mail> m){
		System.out.println("m.size():" + m.size());
		for(int i=0 ; i < m.size() ; i++){
			System.out.println(name + ":as:" + m.get(i).receiverName);
			if(name.compareTo(m.get(i).receiverName) == 0){
				System.out.println(name + ": " + m.get(i).content);
			}
			
		}
	}

	@Override
	public void update(Object o) {
		
		if(o instanceof PostOffice){
			PostOffice po = (PostOffice) o;
			checkMail(po.getState());
		}
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}