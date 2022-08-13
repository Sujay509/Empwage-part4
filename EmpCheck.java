package com.bridgelabz;

public class EmpCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int isfulltime=1;
		double empcheck = Math.floor(Math.random()) * 10 % 2;
		if (empcheck == isfulltime)
			{
			System.out.println("Employeee is present");
			}
		else
			System.out.println("employee is absent");
			
	}
}
			


