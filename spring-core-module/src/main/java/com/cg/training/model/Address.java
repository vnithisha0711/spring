package com.cg.training.model;

public class Address {
	private int id;
	private String houseNumber;
	private String street;
	private String city;
	private String state;
	private String country;
	private int pin;
	
	public Address() {}
	
	public Address(int id, String houseNumber, String street, String city, String state, String country, int pin) {
		super();
		this.id = id;
		this.houseNumber = houseNumber;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pin = pin;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", houseNumber=" + houseNumber + ", street=" + street + ", city=" + city
				+ ", state=" + state + ", country=" + country + ", pin=" + pin + "]";
	}
	
	

}
