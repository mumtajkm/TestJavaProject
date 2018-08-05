package com.mumtaj.pack1;

import com.mumtaj.pack2.PersonalDetails;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome mumtaj, from HelloWorld!");
		
		PersonalDetails pd = new PersonalDetails("Mumtaj", "CA", "train");

		pd.printDetails();
		
		pd.setName("mumtaj2");
		pd.setCountry("canada");
		pd.setCommute("plane");
		
		pd.printDetails();
		
	}

}
