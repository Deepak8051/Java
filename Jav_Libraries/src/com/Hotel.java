package com;

public class Hotel {
	String name;
	double rating;
	public Hotel(String name, double rating) {
	
		this.name = name;
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "name:" +name+"  rating :"+rating;
	}
	

}
