package com.bridgelabz;

public class DailyWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int isfulltime = 1;
	      int emprateperhour = 20;
	      int emphrs = 0;
	      int empwage = 0;
	      double empcheck = Math.floor(Math.random()*10)%2;
	      if(empcheck == isfulltime)
	      {
	    	  emphrs = 8;
	      }
	      else
	    	  emphrs = 0;
	      empwage = emphrs * emprateperhour;
	      System.out.println("emp wage: " + empwage);
		}
	}


