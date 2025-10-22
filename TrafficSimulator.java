package com.codegnan.controlstatements;

import java.util.Scanner;

public class TrafficSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Light State(Green/Red/Yellow)");
		String lightState=sc.next();
        System.out.println("Enter Hour(0-23)");
        int hour=sc.nextInt();
        boolean isDayTime=(hour>=6)&&(hour<=18);
        String action;
        if(lightState.equalsIgnoreCase("green")) {
        	    action="Go";
        	  
        }else {
        	   if(lightState.equalsIgnoreCase("red")){
        		   action="Stop";
        	   }else {
        		   if(lightState.equalsIgnoreCase("yellow")) {
        			   if(isDayTime) {
        				   action="Slow";
        			   }else {
        				   action="Stop";
        			   }
        		   }else {
        			   action="Invalid Light State";
        		   }
        	   }
        }
        System.out.println(action);
        sc.close();
        		
	}

}
