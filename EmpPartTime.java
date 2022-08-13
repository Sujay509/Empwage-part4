package com.bridgelabz;

public class EmpPartTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int isfulltime = 1;
	     int ispartime = 2;
	     int emprateperhour = 20;
	     int emphrs = 0;
	     int empwage = 0;
	     double empCheck = Math.floor(Math.random()*10)%3;
	     if(empCheck == ispartime)
	     {
	    	 emphrs = 4;
	     }
	     else if (empCheck == isfulltime)
	    	 emphrs = 8;
	     else 
	    	 emphrs = 0;
	     empwage = emphrs * emprateperhour;
	     System.out.println("emp wage : "+empwage);
	     
	}

}
