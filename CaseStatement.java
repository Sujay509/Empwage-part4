package com.bridgelabz;

public class CaseStatement {
	public static final int isfulltime=2;
	public static final int ispartime=1;
	public static final int emprateperhour=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int emphrs = 0;
	     int empwage = 0;
	     int empCheck = (int) Math.floor(Math.random()*10)%3;
	     switch (empCheck)
	     {
	     case 1:
	     emphrs = 4;
	     break;
	     
	     case 2:
	    	 emphrs = 8;
	     
	    	 break;
	    	 default:
	    		 
	    		 emphrs = 0;
	    		 
	    		 break;
	     }
	             empwage = emphrs * emprateperhour;
	    	     System.out.println("emp wage : "+empwage);
	    	     
	     
	}

}
