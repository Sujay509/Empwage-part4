package com.bridgelabz;

public class MultipleCompany {
public static final int ispartime = 1;
public static final int isfulltime = 2;
public static int computeEmpwage(String company ,int emprateperhour,int numofworkingdays, int maxhrspermonth)
		                            {
                   int emphrs = 0, totalemphrs = 0, totalworkingdays = 0;
                   while (totalemphrs <= maxhrspermonth &&
                		   totalworkingdays < numofworkingdays) 
                   {
                	   totalworkingdays++;
                	   int empcheck = (int) Math.floor(Math.random() *10)% 3;
                	   switch (empcheck) {
                	   case ispartime:
                		   emphrs = 4;
                	   case isfulltime:
                		   emphrs = 8;
                		   break;
                		   default:
                			   emphrs = 8;
                	   }
                	   totalemphrs += emphrs;
                	   System.out.println("day#: " + totalworkingdays + " emphrs: " +emphrs);
                   }
                   int totalempwage = totalemphrs * emprateperhour;
                   System.out.println("Total emp wage for company: " + company + " is: "+totalempwage);
                   return totalempwage;
	}
               public static void main (String []args) {
				// TODO Auto-generated method stub
                     computeEmpwage ("flipkart" , 100 , 20 , 160);
                     computeEmpwage ("dominos" ,120 ,24 ,140);
			}
}
