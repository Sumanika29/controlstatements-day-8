package com.codegnan.controlstatements;

import java.util.Scanner;

public class ElectricityBillCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of units : ");
		double units = sc.nextDouble();

		System.out.print("Are you a senior citizen? (yes/no): ");
		String isSeniorCitizen = sc.next();
		double bill=0.0;
		if (units <= 100) {
			bill = units * 1.50;
		}else {
			if (units <= 200) {
				bill = 100 * 1.50 + (units - 100) * 2.00;
		  } else {
			  if (units <= 300) {
					bill = 100 * 1.50 + 100 * 2.00 + (units - 200) * 3.00;
			  }else {
				  bill = 100 * 1.50 + 100 * 2.00 + 100 * 3.00 + (units - 300) * 5.00;
			  }
			
		   } 
		}
		System.out.println("base bill "+bill);
		// Apply surcharge if bill exceeds ₹1000
		if (bill > 1000) {
			bill += bill * 0.10;// 10% surcharge
			System.out.println("surcharge"+bill);
		}

		// Apply senior citizen discount
		if (isSeniorCitizen.equalsIgnoreCase("yes")) {
			bill -= bill * 0.05; // 5% discount
			System.out.println("senior citizen discount applied: "+bill);
		}
		System.out.println("total bill "+bill);
		sc.close();
	}
}