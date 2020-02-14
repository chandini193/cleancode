package com.chandini.cleancode;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {   
        Scanner in = new Scanner(System.in);
        String c = "Y";
    	while(c.equals("Y")){
    		System.out.println("Choose option:");    	
            System.out.println( "1. Calculate Interest\n2. Estimate house construction cost");
            System.out.println("Enter option:");
	        int option = in.nextInt();
	        if(option == 1){
	        	Interest interest = new Interest();
	        	System.out.println("Enter the principal amount:");
	        	double principlaAmount = in.nextDouble();
	        	System.out.println("Enter the annual rate of interest(in %):");
	        	double rateOfInterest = in.nextDouble();
	        	System.out.println("Enter the number of periods(time in years):");
	        	double time = in.nextDouble();
	        	System.out.println( "1.Simple Interest\n2. Compound Interest");
	            System.out.println("Enter option:");
	            int choice = in.nextInt();
	            if(choice == 1){
	            	System.out.println("Simple Interest in rupess = "+ interest.simpleInterest(principlaAmount,rateOfInterest, time));
	            }
	            else if(choice == 2){
	            	System.out.println("Compound Interest in rupees = "+ interest.compoundInterest(principlaAmount,rateOfInterest, time));
	            }
	            else{
	            	System.out.println("Invalid Choice...!");
	            }
	        }
	        else if(option == 2){
	        	HouseConstructionCost houseConstructionCost = new HouseConstructionCost();
	        	System.out.println("Choose material standarad");
	        	System.out.println("1.Standard\n2.Above Standard\n3.High Standard\n4.High Standard + Fully Automated");
	        	System.out.println("Enter choice:");
	        	int standard = in.nextInt();
	        	System.out.println("Enter total area of house(in sqft):");
	        	int area = in.nextInt();
	        	System.out.println("Construcion cost = "+ houseConstructionCost.caluclateCost(standard, area));
	        }
	        else{
	        	System.out.println("Invalid Choice...!");
	        }
	        System.out.println("Do you want to continue[Y or N]? : ");
        	c = in.next().toUpperCase();
    	}
	        
    }
}
