package com.mumtaj.pack2;

public class PersonalDetails {
	



	private String name;
	private String country;
	private String commute;
	
	
	public PersonalDetails(String name, String country, String commute) {
		super();
		this.name = name;
		this.country = country;
		this.commute = commute;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getCommute() {
		return commute;
	}


	public void setCommute(String commute) {
		this.commute = commute;
	}


	public void printDetails()
	{
		System.out.println(this.getName());
		System.out.println(this.getCountry());
		System.out.println(this.getCommute());
		System.out.println(" ");
	}
}
