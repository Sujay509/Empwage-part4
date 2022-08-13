package com.bridgelabz;

public class WageForMonth {

	public static final int isfulltime=2;
	public static final int ispartime=1;
	public static final int emprateperhour=20;
	public static final int numofworkingdays=2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int emphrs = 0, empwage = 0, totalempwage = 0;
          for (int day = 0; day < numofworkingdays; day++) {
	           int empCheck = (int) Math.floor(Math.random()*10)%3;
	               switch (empCheck)
               {
                   case ispartime:
                     emphrs = 4;
                   break;
                   case isfulltime:
    	             emphrs = 8;
    	           break;
    	           default:
    		         emphrs = 0;
               }
                   empwage = emphrs * emprateperhour;
                   totalempwage+= empwage;
                   System.out.println("empwage: "+empwage);

	       }
                   System.out.println("total emp wage: " +totalempwage);
	    }
   }


