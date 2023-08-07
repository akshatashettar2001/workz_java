package com.tasks.app;

public class Elevator {
	   public void info(){
	        System.out.println("invoking info without Arguments");
	        info(24);
	        info(50.0);
	        info(25,65);
	    }

	    public void info(int noOfPerson){
	        System.out.println("invoking info with int in Elevator");
	        System.out.println("Maximum Capacity in persons: "+noOfPerson);
	    }

	    public void info(double speedInKM){
	       System.out.println("invoking info with double in Elevator");
	       System.out.println("Speed in Kilometer per hour: "+speedInKM);
	    }

	    public void info(int noOfPerson , double speedInKM){
	        System.out.println("invoking info with int and double in Elevator");
	        System.out.println("Maximum Capacity in persons: "+noOfPerson + "\nSpeed in Kilometer per hour: "+ speedInKM);
	    }
}
