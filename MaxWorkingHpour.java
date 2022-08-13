package com.bridgelabz;

public class MaxWorkingHpour {
	public static final int isfulltime=2;
	public static final int ispartime=1;
	public static final int emprateperhour=20;
	public static final int numofworkingdays=2;
	public static final int maxhrsinmonth=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int emphrs=0, totalemphrs=0, totalworkingdays=0;
		while (totalemphrs <= maxhrsinmonth &&
				totalworkingdays < numofworkingdays)
		{
			totalworkingdays++;
		int empCheck = (int) Math.floor(Math.random()*10)%3;
		 switch (empCheck)
	     {
	     case ispartime:
	     emphrs=4;
	     break;
	     case isfulltime:
	    	 emphrs=8;
	    	 break;
	    	 default:
	    		 emphrs=0;
		}
		 totalemphrs+= emphrs;
		 System.out.println("Day#: "+ totalworkingdays + "emp hr: " +emphrs);
		 
	}
              int totalempwage=totalemphrs*emprateperhour;
              System.out.println("total emp wage: " +totalempwage);
}
}
