package com.codegnan.controlstatements;

import java.util.Scanner;

public class TicketPricing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter passenger type(child/adult/senior)");
		String passengerType=sc.next();
		System.out.println("enter booking time(early/normal/late)");
		String bookingTime=sc.next();
		boolean isMember=true;
		double baseprice=5000;
		//passenger type discount
		if(passengerType.equalsIgnoreCase("child")){
			baseprice*=0.5;
		}else {
			if(passengerType.equalsIgnoreCase("senior")){
				baseprice*=0.8;
			} else {
				if(passengerType.equalsIgnoreCase("adult")){
					//no discount
			     }else {
			    	    System.out.println("Invalid Passenger Type");
			     }
			}
		}
		//booking time adjustment
		if(bookingTime.equalsIgnoreCase("early")) {
			baseprice*=0.9;
		}else {
			if(bookingTime.equalsIgnoreCase("normal")) {
				//no discount
		    } else {
		    	    if(bookingTime.equalsIgnoreCase("last-minute")) {
					 baseprice*=1.2;
		        } else {
		          	System.out.println("Invalid booking time");
		        }
		        	
		    }
		        	     
		}
		if(isMember) {
			baseprice*=0.95;
		}
		System.out.println("Final Ticket Price: "+baseprice);  
		sc.close();
   }
}
  
