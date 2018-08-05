package com.mumtaj.pack1;

import com.mumtaj.pack2.PersonalDetails;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome mumtaj, from HelloWorld!");
		
		PersonalDetails pd = new PersonalDetails("Mumtaj", "CA", "train");

		/**
		 * prints the personal details
		 */
		pd.printDetails();
		
		// sets the values
		pd.setName("mumtaj2");
		pd.setCountry("canada");
		pd.setCommute("plane");
		
		pd.printDetails();
		
		
		pd.setName("mumtaj4");
		pd.setCountry("canada");
		pd.setCommute("train");
		
		pd.printDetails();
		
	}

}
