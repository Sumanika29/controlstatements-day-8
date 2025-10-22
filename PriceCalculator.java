package com.codegnan.controlstatements;

import java.util.Scanner;

public class PriceCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter total amount");
		double totalAmount=sc.nextDouble();
		System.out.println("it is a festival season(yes/no):");
		String festivalSeason=sc.next();
		boolean isMember=true;
		if(totalAmount>=10000) {
			totalAmount-=totalAmount*0.20;
		}else {
			if(totalAmount>=5000) {
				totalAmount-=totalAmount*0.10;
			}else {
				System.out.println("no discount");
			}
		}
		if(festivalSeason.equalsIgnoreCase("yes")) {
			totalAmount-=totalAmount*0.05;
		}
		if(isMember) {
			totalAmount-=200;
		}
		System.out.println("Final Payable Amount "+totalAmount);
		sc.close();
			

	}

}
